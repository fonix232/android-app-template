package extensions

import org.gradle.api.Project
import java.io.FileNotFoundException
import java.util.*

private const val LOCAL_PROPERTIES_FILE_NAME = "local.properties"
private const val KEYSTORE_PROPERTIES_FILE_NAME = "keystore.properties"

/**
 * Obtain property declared on `$projectRoot/local.properties` file.
 *
 * @param propertyName the name of declared property
 */
fun Project.getLocalProperty(propertyName: String): String? = getPropertyOrNull(LOCAL_PROPERTIES_FILE_NAME, propertyName)

/**
 * Obtain property declared on `$projectRoot/keystore.properties` file.
 *
 * @param propertyName the name of declared property
 */
fun Project.getKeystoreProperty(propertyName: String): String = getProperty(KEYSTORE_PROPERTIES_FILE_NAME, propertyName)

/**
 * Obtain property declared on `$projectRoot/$fileName` file.
 *
 * @param fileName the name of the file containing the property
 * @param propertyName the name of declared property
 *
 * @return the value of property name or null
 */
fun Project.getPropertyOrNull(fileName: String, propertyName: String): String? {
    val props = Properties().apply {
        val localPropertiesFile = project.rootProject.file(fileName)
        if (localPropertiesFile.exists()) {
            load(localPropertiesFile.inputStream())
        }
    }

    return props.getProperty(propertyName)
}

/**
 * Obtain property declared on `$projectRoot/$fileName` file.
 *
 * @param fileName the name of the file containing the property
 * @param propertyName the name of declared property
 *
 * @return the value of property name or throw exception
 */
fun Project.getProperty(fileName: String, propertyName: String): String {
    val props = Properties().apply {
        val localPropertiesFile = project.rootProject.file(fileName)
        if (localPropertiesFile.exists()) {
            load(localPropertiesFile.inputStream())
        } else {
            throw FileNotFoundException(fileName)
        }
    }

    return props.getProperty(propertyName) ?: throw Exception("Value is null!")
}


