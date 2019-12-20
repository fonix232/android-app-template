package utils

import java.util.*

fun executeCommand(command: String): String {
    val pb = ProcessBuilder("/bin/sh", "-c", command)
    var result = ""
    try {
        val process = pb.start()
        val reader = process.inputStream.bufferedReader()
        reader.lines().forEach { line -> result += line }
        process.waitFor()
        process.destroy()
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return result
}

fun generateVersionNameSuffix(): String {
    return "-${generateDateStamp()} (${getGitCommit()})"
}

@Suppress("DEPRECATION")
fun generateDateStamp(): Int {
    val date = Date()

    return (date.year - 100) * 100_000_000 +
        (date.month + 1) * 1_000_000 +
        (date.date) * 10_000 +
        (date.hours) * 100 +
        (date.minutes)
}

fun getGitCommit(): String {
    return executeCommand("git rev-parse --short HEAD") + if (isGitDirty()) ".dirty" else ""
}

fun getGitVersion(): String {
    return executeCommand("git describe --tags --abbrev=0 \"--match=v*\" | tr -d v")
}

fun isGitDirty(): Boolean {
    return !executeCommand("git diff --shortstat 2> /dev/null | tail -n1").isBlank()
}
