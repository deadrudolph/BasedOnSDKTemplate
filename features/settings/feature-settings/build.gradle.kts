plugins {
    id("com.deadrudolph.android.library")
    id("com.deadrudolph.android.di")
}

android {
    namespace = "com.deadrudolph.feature_settings"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

dependencies {
    implementation(projects.features.settings.featureSettingsDomain)

    implementation(sdk.commonDi)
    implementation(sdk.commonDomain)
    implementation(sdk.core)
    implementation(sdk.navigation)
    implementation(sdk.uiComponents)

    implementation(libs.appcompat)
    implementation(libs.composeUI)
    implementation(libs.composeMaterial)
    implementation(libs.composeUITooling)
    implementation(libs.composeFoundation)
    implementation(libs.dagger)
    ksp(libs.daggerCompiler)

    implementation(libs.fragmentKtx)
    implementation(libs.material)
    implementation(libs.viewModelScope)

    implementation(libs.navigation)
}
