plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    kotlin("android").apply(false)
    kotlin("multiplatform").apply(false)
    kotlin("plugin.serialization").apply(false)
    id("org.jetbrains.compose").apply(false)
    id("com.squareup.sqldelight").apply(false)


}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
