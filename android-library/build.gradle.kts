/*
 * This file is part of Pixie (https://github.com/fonix232/Pixie/)
 * Copyright (c) 2019 Jozsef Kiraly <fonix232@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

import extensions.applyDefaults

plugins {
    id(GradleItems.Plugins.Android.Library)
    id(GradleItems.Plugins.Kotlin.Android)
    id(GradleItems.Plugins.Kotlin.Extensions)
    id(GradleItems.Plugins.Kotlin.Kapt)
}

android.applyDefaults(project)

dependencies {
    // Kotlin
    implementation(Dependencies.Kotlin.StdLib_JDK8)
    implementation(Dependencies.Kotlin.Reflect)
    implementation(Dependencies.Kotlin.Coroutines.Android)

    // Support libraries
    implementation(Dependencies.AndroidX.Activity_Ktx)
    implementation(Dependencies.AndroidX.AppCompat)
    implementation(Dependencies.AndroidX.AppCompat_Resources)
    implementation(Dependencies.AndroidX.CardView)
    implementation(Dependencies.AndroidX.ConstraintLayout.Base)
    implementation(Dependencies.AndroidX.CoordinatorLayout)
    implementation(Dependencies.AndroidX.Core_Ktx)
    implementation(Dependencies.AndroidX.Fragment_Ktx)
    implementation(Dependencies.AndroidX.Legacy_V4)
    implementation(Dependencies.AndroidX.RecyclerView)

    // Lifecycle
    implementation(Dependencies.AndroidX.Lifecycle.Runtime_Ktx)
    implementation(Dependencies.AndroidX.Lifecycle.Livedata_Ktx)
    implementation(Dependencies.AndroidX.Lifecycle.Viewmodel_Ktx)
    implementation(Dependencies.AndroidX.Lifecycle.Extensions)
    implementation(Dependencies.AndroidX.Lifecycle.Common_Java8)
    implementation(Dependencies.AndroidX.Work.Runtime_Ktx)

    // Material Design
    implementation(Dependencies.AndroidX.MaterialDesign)

    // Dependency Injection
    implementation(Dependencies.Koin.Android)
    implementation(Dependencies.Koin.AndroidX_ViewModel)

    // Utilities
    implementation(Dependencies.Utility.Insetter.Core)
    implementation(Dependencies.Utility.Insetter.Kotlin)
    implementation(Dependencies.Utility.Insetter.Databinding)
    implementation(Dependencies.Utility.Insetter.Widgets)

    // Databinding
    implementation(Dependencies.AndroidX.Databinding.Adapters)
    implementation(Dependencies.AndroidX.Databinding.Runtime)
    kapt(Dependencies.AndroidX.Databinding.Compiler)
}
