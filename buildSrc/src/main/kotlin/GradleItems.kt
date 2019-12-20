object GradleItems {
    object Dependencies {
        val Android = "com.android.tools.build:gradle:${Versions.Gradle}"
        val Kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}"


        val Dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.Dokka}"
        val Dokka_Android = "org.jetbrains.dokka:dokka-android-gradle-plugin:${Versions.Dokka}"
        val Fabric = "io.fabric.tools:gradle:1.31.2"
        val Firebase = "com.google.firebase:firebase-plugins:2.0.0"
        val FirebasePerf = "com.google.firebase:perf-plugin:1.3.0"
        val GitVersion = "gradle.plugin.com.palantir.gradle.gitversion:gradle-git-version:${Versions.GitVersion}"
        val Ktlint = "org.jlleitschuh.gradle:ktlint-gradle:8.1.0"
        val Navigation_SafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.AndroidX.Navigation}"
        val PlayServices = "com.google.gms:google-services:4.3.2"
        val Realm = "io.realm:realm-gradle-plugin:${Versions.Realm}"

        val JUnitAndroid = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.JUnitAndroid}"
        val Jacoco = "org.jacoco:org.jacoco.core:${Versions.Jacoco}"
    }

    object Plugins {

        val Detekt = "io.gitlab.arturbosch.detekt"
        val Dokka = "org.jetbrains.dokka"
        val Dokka_Android = "org.jetbrains.dokka-android"
        val Fabric = "io.fabric"
        val GitVersion = "com.palantir.git-version"
        val GoogleServices = "com.google.gms.google-services"
        val Ktlint = "org.jlleitschuh.gradle.ktlint"
        val Versions = "com.github.ben-manes.versions"
        val Realm = "realm-android"

        val JUnitAndroid = "de.mannodermaus.android-junit5"
        val Jacoco = "jacoco"

        object Java {
            val Library = "java-library"
        }

        object Kotlin {
            val Core = "kotlin"
            val Android = "kotlin-android"
            val Extensions = "kotlin-android-extensions"
            val Kapt = "kotlin-kapt"
        }

        object Android {
            val App = "com.android.application"
            val Library = "com.android.library"
        }

        object AndroidX {
            val SafeArgs = "androidx.navigation.safeargs"
            val SafeArgs_Kotlin = "androidx.navigation.safeargs.kotlin"
        }

        object Firebase {
            val Performance = "com.google.firebase.firebase-perf"
        }
    }
}