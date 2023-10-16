plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    kotlin("plugin.serialization")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.squareup.sqldelight")
}
val sqldelightVersion = extra["sqldelight.version"] as String

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
        }
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.material3)
                implementation(compose.ui)
                implementation("com.squareup.sqldelight:runtime:$sqldelightVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")

                //put your multiplatform dependencies here
            }
        }

        val androidMain by getting {
            dependencies{
                implementation("com.squareup.sqldelight:android-driver:$sqldelightVersion")
            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting

        val iosMain by getting {
            dependencies{
                dependsOn(commonMain)
                implementation("com.squareup.sqldelight:native-driver:$sqldelightVersion")
            }
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
sqldelight {
    database("r2hDatabase") {
        packageName = "com.cyphergames.r2h"
        sourceFolders = listOf("sqldelight")
    }
}


android {
    namespace = "com.cyphergames.r2h"
    compileSdk = 33
    defaultConfig {
        compileSdkPreview = "UpsideDownCake"
        minSdk = 24
    }
}