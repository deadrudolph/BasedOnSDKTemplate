enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "template_based_on_sdk"

include(
    "app",
)

include(
    ":features:settings:feature-settings",
    ":features:settings:feature-settings-domain",
)

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://maven.pkg.github.com/deadrudolph/SDKTemplate") {
            credentials {
                username = "deadrudolph"
                // Readonly token for Github Packages
                password = "<Contact the code owner to get a ReadOnly token>"
            }
        }
    }
}

dependencyResolutionManagement {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://jitpack.io")
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
        maven(url = "https://maven.pkg.github.com/deadrudolph/SDKTemplate") {
            credentials {
                username = "deadrudolph"
                // Readonly token for Github Packages
                password = "<Contact the code owner to get a ReadOnly token>"
            }
        }
    }

    versionCatalogs {
        create("sdk") {
            from(files("gradle/sdk.versions.toml"))
        }
    }
}
