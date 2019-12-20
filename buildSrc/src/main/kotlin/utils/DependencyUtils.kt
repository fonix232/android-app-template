@file:Suppress("PackageDirectoryMismatch")

import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven

fun RepositoryHandler.addDefaults() {
    addDefaultRepositories(this)
}

fun addDefaultRepositories(handler: RepositoryHandler) {
    handler.apply {
        mavenCentral()
        jcenter()
        google()
        maven("https://maven.fabric.io/public")
        maven("https://plugins.gradle.org/m2/")
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://jitpack.io")
    }
}