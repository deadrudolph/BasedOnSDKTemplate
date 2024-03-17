plugins {
    id("com.deadrudolph.android.application")
    id("com.deadrudolph.android.test")
    id("com.deadrudolph.android.di")
}

android {

    namespace = "com.deadrudolph.template_based_on_sdk"

    defaultConfig {
        applicationId = "com.deadrudolph.template_based_on_sdk"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
}

dependencies {
    implementation(projects.features.settings.featureSettings)

    implementation(sdk.bundles.common)
    implementation(sdk.bundles.features)
    implementation(sdk.core)
    implementation(sdk.navigation)
    implementation(sdk.uiComponents)

    implementation(libs.appcompat)
    implementation(libs.coreKtx)
    implementation(libs.material)
    implementation(libs.timber)
    implementation(libs.composeActivity)
    implementation(libs.composeUI)
    implementation(libs.composeMaterial)
    implementation(libs.composeUITooling)
    implementation(libs.composeFoundation)

    implementation(libs.navigation)
}
