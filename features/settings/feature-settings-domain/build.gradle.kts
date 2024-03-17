plugins {
    id("com.deadrudolph.android.library")
    id("com.deadrudolph.android.di")
}

android {
    namespace = "com.deadrudolph.feature_settings_domain"

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

dependencies {
    implementation(sdk.commonDi)
    implementation(sdk.commonNetwork)
    implementation(sdk.commonDomain)

    implementation(libs.dagger)
    ksp(libs.daggerCompiler)
    implementation(libs.retrofit)
    implementation(libs.moshiKotlin)
}
