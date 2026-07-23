pluginManagement {
    repositories {
        maven {
            name = "FabricMC"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "Gradle Plugin Portal"
            url = uri("https://plugins.gradle.org/m2/")
        }
        gradlePluginPortal()
    }
}
rootProject.name = "S1MPLE-Performance-Client"