plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("8.0.2").apply(false)
    id("com.android.library").version("8.0.2").apply(false)
    kotlin("android").version("1.9.10").apply(false)
    kotlin("multiplatform").version("1.9.10").apply(false)
    id("org.jetbrains.compose").version("1.5.1") apply false
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
