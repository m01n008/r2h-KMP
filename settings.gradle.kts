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
        val sqldelightVersion = extra["sqldelight.version"] as String


        id("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)
        kotlin("android").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        kotlin("plugin.serialization").version(kotlinVersion)
        id("org.jetbrains.compose").version(composeVersion)
        id("com.squareup.sqldelight").version(sqldelightVersion)


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