package extensions

import com.android.build.gradle.api.AndroidSourceSet
import org.gradle.api.NamedDomainObjectContainer
import java.io.File

fun NamedDomainObjectContainer<AndroidSourceSet>.kotlinize() {
    forEach { it.java.srcDir("src/${it.name}/kotlin") }
}

fun NamedDomainObjectContainer<AndroidSourceSet>.addRoomAssets(projectDir: File) {
    getByName("androidTest") {
        assets.srcDirs(assets.srcDirs, "$projectDir/schemas")
    }
}