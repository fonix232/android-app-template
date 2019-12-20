package extensions

import BuildInfo
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.AppExtension
import org.gradle.api.JavaVersion
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.android.build.gradle.internal.dsl.LintOptions
import com.android.build.gradle.internal.dsl.PackagingOptions
import org.gradle.api.Project
import utils.*
import java.io.File
import java.io.FileNotFoundException

fun LibraryExtension.applyDefaults(project: Project) = this.apply {
    compileSdkVersion(BuildInfo.CompileSdk)
    defaultConfig {
        minSdkVersion(BuildInfo.MinSdk)
        targetSdkVersion(BuildInfo.TargetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        coreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

//    TODO: There's an issue with Kotlin DSL, using the main Gradle file for now
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
    lintOptions.applyDefaults(project)
    packagingOptions.applyDefaults()
    sourceSets.kotlinize()
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

fun AppExtension.applyDefaults(project: Project) = this.apply {
    flavorDimensions("type")
    signingConfigs {
//        create("travis") {
//            storeFile = project.rootProject.file("debug.jks")
//            storePassword = System.getenv("STORE_PASSWORD")
//            keyAlias = "release"
//            keyPassword = System.getenv("KEY_PASSWORD")
//        }
//        // TODO: Enable this config once ready
//        create("release") {
//            storeFile = project.rootProject.file(project.getKeystoreProperty("storeFile"))
//            storePassword = project.getKeystoreProperty("storePassword")
//            keyAlias = project.getKeystoreProperty("keyAlias")
//            keyPassword = project.getKeystoreProperty("keyPassword")
//        }
    }

    compileSdkVersion(BuildInfo.CompileSdk)
    defaultConfig {
        applicationId = BuildInfo.packageName
        minSdkVersion(BuildInfo.MinSdk)
        targetSdkVersion(BuildInfo.TargetSdk)
        versionCode = BuildInfo.versionCode()
        versionName = BuildInfo.versionName()
        versionNameSuffix = generateVersionNameSuffix()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        stringField("GIT_HASH", getGitCommit())
        stringField("BUILD_DATE", generateDateStamp().toString())
    }
    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            applicationIdSuffix = ".dev"
        }

        getByName("release") {
            isMinifyEnabled = true
            //signingConfig = signingConfigs.getByName("release")
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        coreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

//    TODO: There's an issue with Kotlin DSL, using the main Gradle file for now
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
    lintOptions.applyDefaults(project)
    packagingOptions.applyDefaults()
    sourceSets.kotlinize()
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

fun BaseAppModuleExtension.applyDefaults(project: Project) = this.apply {
    (this as AppExtension).applyDefaults(project)
    bundle {
        language {
            enableSplit = true
        }
        density {
            enableSplit = true
        }
        abi {
            enableSplit = true
        }
    }
}

fun LibraryExtension.addRoom(projectDir: File) = this.apply {
    defaultConfig {
        javaCompileOptions {
            annotationProcessorOptions {
                arguments(mapOf("room.schemaLocation" to "$projectDir/schemas"))
            }
        }
    }
    sourceSets.addRoomAssets(projectDir)
}


//region Utils
fun LintOptions.applyDefaults(project: Project) {
    lintConfig = project.rootProject.file(".lint/config.xml")
    isCheckAllWarnings = true
    isWarningsAsErrors = false
}

fun PackagingOptions.applyDefaults() {
    exclude("META-INF/DEPENDENCIES")
    exclude("META-INF/LICENSE.md")
    exclude("META-INF/LICENSE-notice.md")
}
//endregion
