object Dependencies {
    object Kotlin {
        val StdLib_JDK7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin}"
        val StdLib_JDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.Kotlin}"
        val Reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.Kotlin}"

        object Coroutines {
            val Core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Coroutines}"
            val Android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines}"
            val PlayServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.Coroutines}"
            val Reactive = "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:${Versions.Coroutines}"
            val Reactor = "org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${Versions.Coroutines}"
            val Rx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.Coroutines}"
            val Test =  "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Coroutines}"
        }
    }

    object Android {
        object Databinding {
            val BaseLibrary = "com.android.databinding:baseLibrary:${Versions.Gradle}"
            val Library = "com.android.databinding:library:${Versions.Gradle}"
            val Adapters = "com.android.databinding:adapters:${Versions.Gradle}"
            val CompilerCommon = "com.android.databinding:compilerCommon:${Versions.Gradle}"
            val Compiler = "com.android.databinding:compiler:${Versions.Gradle}"
            val Viewbinding = "com.android.databinding:viewbinding:${Versions.Gradle}"
            val DataBinder = "com.android.databinding:dataBinder:${Versions.Gradle}"
            val ViewBinding_Support = "com.android.databinding:viewbinding-support:${Versions.Gradle}"
        }
    }

    object AndroidX {
        val Activity = "androidx.activity:activity:${Versions.AndroidX.Activity}"
        val Activity_Ktx = "androidx.activity:activity-ktx:${Versions.AndroidX.Activity}"
        val AnimatedVectorDrawable = "androidx.vectordrawable:vectordrawable-animated:1.0.0"
        val Annotation = "androidx.annotation:annotation:1.1.0-alpha02"
        val AppCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.AppCompat}"
        val AppCompat_Resources = "androidx.appcompat:appcompat-resources:${Versions.AndroidX.AppCompat}"
        val CardView = "androidx.cardview:cardview:1.0.0"
        val Collection = "androidx.collection:collection:${Versions.AndroidX.Collection}"
        val Collection_Ktx = "androidx.collection:collection-ktx:${Versions.AndroidX.Collection}"
        val CoordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:${Versions.AndroidX.CoordinatorLayout}"
        val Core = "androidx.core:core:${Versions.AndroidX.Core}"
        val Core_Ktx = "androidx.core:core-ktx:${Versions.AndroidX.Core}"
        val DrawerLayout = "androidx.drawerlayout:drawerlayout:1.0.0"
        val DynamicAnimation = "androidx.dynamicanimation:dynamicanimation:${Versions.AndroidX.DynamicAnimation}"
        val DynamicAnimation_Ktx = "androidx.dynamicanimation-ktx:${Versions.AndroidX.DynamicAnimation}"
        val Emoji = "androidx.emoji:emoji:${Versions.AndroidX.Emoji}"
        val Emoji_AppCompat = "androidx.emoji:emoji-appcompat:${Versions.AndroidX.Emoji}"
        val Emoji_Bundled = "androidx.emoji:emoji-bundled:${Versions.AndroidX.Emoji}"
        val ExifInterface = "androidx.exifinterface:exifinterface:${Versions.AndroidX.ExifInterface}"
        val Fragment = "androidx.fragment:fragment:${Versions.AndroidX.Fragment}"
        val Fragment_Ktx = "androidx.fragment:fragment-ktx:${Versions.AndroidX.Fragment}"
        val Fragment_Testing = "androidx.fragment:fragment-testing:${Versions.AndroidX.Fragment}"
        val GridLayout = "androidx.gridlayout:gridlayout:1.0.0"
        val Legacy_V4 = "androidx.legacy:legacy-support-v4:1.0.0"
        val Loader = "androidx.loader:loader:1.1.0-beta01"
        val MaterialDesign = "com.google.android.material:material:${Versions.MaterialDesign}"
        val MultiDex = "androidx.multidex:multidex:2.0.1"
        val MultiDex_Instrumentation = "androidx.multidex:multidex-instrumentation:2.0.0"
        val Palette = "androidx.palette:palette:1.0.0"
        val Percent = "androidx.percentlayout:percentlayout:1.0.0"
        val Preference = "androidx.preference:preference:1.1.0-alpha04"
        val Preference_Ktx = "androidx.preference:preference-ktx:1.1.0-alpha04"
        val RecyclerView = "androidx.recyclerview:recyclerview:${Versions.AndroidX.RecyclerView}"
        val RecyclerView_Selection = "androidx.recyclerview:recyclerview-selection:${Versions.AndroidX.RecyclerView_Selection}"
        val SavedState = "androidx.savedstate:savedstate:1.0.0-alpha02"
        val SlidingPanelLayout = "androidx.slidingpanelayout:slidingpanellayout:1.0.0"
        val SwipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0-alpha01"
        val Transition = "androidx.transition:transition:1.1.0-alpha02"
        val VectorDrawable = "androidx.vectordrawable:vectordrawable:1.1.0-alpha01"
        val VersionedParcelable = "androidx.versionedparcelable:versionedparcelable:1.1.0-alpha02"
        val ViewPager = "androidx.viewpager:viewpager:1.0.0-alpha1"
        val ViewPager2 = "androidx.viewpager2:viewpager2:1.0.0-alpha02"

        object Arch {
            val Core = "androidx.arch.core:core:${Versions.AndroidX.Arch}"
            val Common = "androidx.arch.core:core-common:${Versions.AndroidX.Arch}"
            val Runtime = "androidx.arch.core:core-runtime:${Versions.AndroidX.Arch}"
            val Testing = "androidx.arch.core:core-testing:${Versions.AndroidX.Arch}"
        }

        object ConstraintLayout {
            val Base = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.ConstraintLayout}"
            val Solver = "androidx.constraintlayout:constraintlayout-solver:${Versions.AndroidX.ConstraintLayout}"
        }

        object Databinding {
            private val BASE = "androidx.databinding"

            val Adapters = "${BASE}:databinding-adapters:${Versions.Gradle}"
            val Common = "${BASE}:databinding-common:${Versions.Gradle}"
            val Runtime = "${BASE}:databinding-runtime:${Versions.Gradle}"
            val CompilerCommon = "${BASE}:databinding-compiler-common:${Versions.Gradle}"
            val Compiler = "${BASE}:databinding-compiler:${Versions.Gradle}"
        }

        object Lifecycle {
            val Common = "androidx.lifecycle:lifecycle-common:${Versions.AndroidX.Lifecycle}"
            val Common_Java8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.AndroidX.Lifecycle}"
            val Compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.Lifecycle}"
            val Extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.AndroidX.Lifecycle}"
            val Livedata = "androidx.lifecycle:lifecycle-livedata:${Versions.AndroidX.Lifecycle}"
            val Livedata_Ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.Lifecycle}"
            val Livedata_Core = "androidx.lifecycle:lifecycle-livedata-core:${Versions.AndroidX.Lifecycle}"
            val ReactiveStreams = "androidx.lifecycle:lifecycle-reactivestreams:${Versions.AndroidX.Lifecycle}"
            val ReactiveStreams_Ktx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.AndroidX.Lifecycle}"
            val Runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.AndroidX.Lifecycle}"
            val Runtime_Ktx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.Lifecycle}"
            val Viewmodel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.AndroidX.Lifecycle}"
            val Viewmodel_Ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.Lifecycle}"

            val ViewModel_SavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:1.0.0-alpha01"
        }

        object Paging {
            val Common = "androidx.paging:paging-common:${Versions.AndroidX.Paging}"
            val Runtime = "androidx.paging:paging-runtime:${Versions.AndroidX.Paging}"
            val RxJava2 = "androidx.paging:paging-rxjava2:${Versions.AndroidX.Paging}"
        }

        object Room {
            val Common = "androidx.room:room-common:${Versions.AndroidX.Room}"
            val Migration = "androidx.room:room-migration:${Versions.AndroidX.Room}"

            val Compiler = "androidx.room:room-compiler:${Versions.AndroidX.Room}"
            val Runtime = "androidx.room:room-runtime:${Versions.AndroidX.Room}"
            val Ktx = "androidx.room:room-ktx:${Versions.AndroidX.Room}"

            val Guava = "androidx.room:room-guava:${Versions.AndroidX.Room}"
            val RxJava2 = "androidx.room:room-rxjava2:${Versions.AndroidX.Room}"
            val Testing = "androidx.room:room-testing:${Versions.AndroidX.Room}"
        }

        object Sqlite {
            val Core = "androidx.sqlite:sqlite:${Versions.AndroidX.Sqlite}"
            val Core_Ktx = "androidx.sqlite:sqlite-ktx:${Versions.AndroidX.Sqlite}"
            val Framework = "androidx.sqlite:sqlite-framework:${Versions.AndroidX.Sqlite}"
        }

        object Test {
            val GROUP = "androidx.test"
            val VERSION = "1.2.0"

            object Espresso {
                val VERSION = "3.1.0"
                val GROUP = "androidx.test.espresso"
                val Core = "$GROUP:espresso-core:$VERSION"
            }

            object Ext {
                val VERSION = "1.0.0"
                val GROUP = "androidx.test.ext"
                val JUnit = "$GROUP:junit:$VERSION"
            }

            val Core = "$GROUP:core:$VERSION"
            val Runner = "$GROUP:runner:$VERSION"
            val Rules = "$GROUP:rules:$VERSION"
        }

        object Work {
            private val BASE = "androidx.work"
            val Runtime = "androidx.work:work-runtime:${Versions.AndroidX.Work}"
            val Runtime_Ktx = "androidx.work:work-runtime-ktx:${Versions.AndroidX.Work}"

            val RxJava2 = "androidx.work:work-rxjava2:${Versions.AndroidX.Work}"
            val Testing = "androidx.work:work-testing:${Versions.AndroidX.Work}"
        }
    }
    
    object Data {
        val Gson = "com.google.code.gson:gson:2.8.6"
        object Moshi {
            private const val GROUP = "com.squareup.moshi"
            private const val VERSION = "1.9.2"

            val Core = "$GROUP:moshi:$VERSION"
            val Kotlin = "$GROUP:moshi-kotlin:$VERSION"
            val Processor = "$GROUP:moshi-kotlin-codegen:$VERSION"
        }
    }

    object Debug {
        object Stetho {
            val Core = "com.facebook.stetho:stetho:${Versions.Stetho}"
            val OkHttp3 = "com.facebook.stetho:stetho-okhttp3:${Versions.Stetho}"
        }
    }

    object Firebase {
        val Core = "com.google.firebase:firebase-core:17.0.1"

        val Analytics = "com.google.firebase:firebase-analytics:17.2.1"
        val Crashlytics = "com.crashlytics.sdk.android:crashlytics:2.10.1"
        val Database = "com.google.firebase:firebase-database:16.0.6"
        val DynamicLinks = "com.google.firebase:firebase-dynamic-links:16.1.7"
        val Firestore = "com.google.firebase:firebase-firestore:18.0.1"
        val InAppMessaging = "com.google.firebase:firebase-inappmessaging-display:17.0.5"
        val Performance = "com.google.firebase:firebase-perf:18.0.1"
        val RemoteConfig = "com.google.firebase:firebase-config:16.3.0"
        val Storage = "com.google.firebase:firebase-storage:16.0.5"
    }

    object Image {
        object Glide {
            val Core = "com.github.bumptech.glide:glide:${Versions.Glide}"
            val Processor = "com.github.bumptech.glide:compiler:${Versions.Glide}"
        }
    }

    object Koin {
        val Core = "org.koin:koin-core:${Versions.Koin}"
        val Android = "org.koin:koin-android:${Versions.Koin}"
        val Scope = "org.koin:koin-android-scope:${Versions.Koin}"
        val AndroidX_Scope = "org.koin:koin-androidx-scope:${Versions.Koin}"
        val ViewModel = "org.koin:koin-android-viewmodel:${Versions.Koin}"
        val AndroidX_ViewModel = "org.koin:koin-androidx-viewmodel:${Versions.Koin}"

        val Test = "org.koin:koin-test:${Versions.Koin}"
    }

    object Networking {
        object Retrofit {
            val Core = "com.squareup.retrofit2:retrofit:${Versions.Retrofit}"
            val Mock = "com.squareup.retrofit2:retrofit-mock:${Versions.Retrofit}"

            object Serializers {
                val Gson = "com.squareup.retrofit2:converter-gson:${Versions.Retrofit}"
                val Jackson = "com.squareup.retrofit2:converter-jackson:${Versions.Retrofit}"
                val Moshi = "com.squareup.retrofit2:converter-moshi:${Versions.Retrofit}"
                val Protobuf = "com.squareup.retrofit2:converter-protobuf:${Versions.Retrofit}"
                val Wire = "com.squareup.retrofit2:converter-wire:${Versions.Retrofit}"
                val XML = "com.squareup.retrofit2:converter-simplexml:${Versions.Retrofit}"
            }
        }

        object OkHttp {
            val VERSION = Versions.OkHttp
            val GROUP = "com.squareup.okhttp3"

            val Core = "$GROUP:okhttp:$VERSION"
            val MockWebserver = "$GROUP:mockwebserver:$VERSION"
            val HttpLoggingInterceptor = "$GROUP:logging-interceptor:$VERSION"
        }

        object Chuck {
            val Debug = "com.readystatesoftware.chuck:library:${Versions.Chuck}"
            val Release = "com.readystatesoftware.chuck:library-no-op:${Versions.Chuck}"
        }
    }

    object View {
        object Epoxy {
            private const val VERSION = "3.7.0"
            val Core = "com.airbnb.android:epoxy:$VERSION"
            val Processor = "com.airbnb.android:epoxy-processor:$VERSION"
        }

        object Lottie {
            private const val VERSION = "3.0.7"
            val Core = "com.airbnb.android:lottie:$VERSION"
        }
    }

    object Utility {
        val CircleImageView = "de.hdodenhof:circleimageview:3.0.1"
        val Krop = "com.github.avito-tech:krop:0.44"
        val ReplayingShare = "com.jakewharton.rx2:replaying-share:2.2.0"
        val Dexter = "com.karumi:dexter:6.0.0"

        object Insetter {
            private const val GROUP = "dev.chrisbanes"
            private const val VERSION = "0.2.0"

            val Core = "$GROUP:insetter:$VERSION"
            val Kotlin = "$GROUP:insetter-ktx:$VERSION"
            val Databinding = "$GROUP:insetter-dbx:$VERSION"
            val Widgets = "$GROUP:insetter-widgets:$VERSION"
        }
    }

    object Test {
        object JUnit {
            object Jupiter {
                val API = "org.junit.jupiter:junit-jupiter-api:${Versions.JUnit}"
                val Engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.JUnit}"
                val Params = "org.junit.jupiter:junit-jupiter-params:${Versions.JUnit}"
            }

            val JUnit4 = "junit:junit:4.12"
        }

        object MockK {
            val Unit = "io.mockk:mockk:${Versions.MockK}"
            val Android = "io.mockk:mockk-android:${Versions.MockK}"
        }

        object Jacoco {
            val GROUP = "org.jacoco"
            val VERSION = "0.8.0"

            val Core = "$GROUP:org.jacoco.core:$VERSION"
        }

        val Robolectric = "org.robolectric:robolectric:4.3"
        val Hamcrest = "org.hamcrest:hamcrest-library:2.2"
        val Hamkrest = "com.natpryce:hamkrest:1.7.0.0"
        val AssertJ = "org.assertj:assertj-core:3.11.1"
        val AssertK = "com.willowtreeapps.assertk:assertk-jvm:0.20"
        val JUnit5Runner = "de.mannodermaus.junit5:android-test-runner:1.0.0"
    }
}
