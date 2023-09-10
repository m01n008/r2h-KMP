pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        val agpVersion = extra["agp.version"] as String
        val kotlinVersion = extra["kotlin.version"] as String
        val composeVersion = extra["compose.version"] as String

        id("com.android.application").version(agpVersion).apply(false)
        id("com.android.library").version(agpVersion).apply(false)
        kotlin("android").version(kotlinVersion).apply(false)
        kotlin("multiplatform").version(kotlinVersion).apply(false)
        id("org.jetbrains.compose").version(composeVersion) apply false


    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "r2h"
include(":androidApp")
include(":shared")