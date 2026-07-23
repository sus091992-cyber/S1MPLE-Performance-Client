buildscript {
    repositories {
        mavenCentral()
        maven("https://maven.fabricmc.net/")
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("net.fabricmc:fabric-loom:1.4.1")
    }
}

apply(plugin = "fabric-loom")

version = "1.0.0"
group = "com.s1mple.performance"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
    maven("https://maven.caffeinemc.org/sodium/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.4")

    mappings("net.fabricmc:yarn:1.21.4+build.1:v2")

    modImplementation("net.fabricmc:fabric-loader:0.16.2")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.118.0+1.21.4")

    modCompileOnly("net.caffeinemc.sodium:sodium-fabric:0.6.0+mc1.21.4")
}

loom {
    runConfigs {
        "client" {
            ideConfigGenerated(true)
        }
    }
}

processResources {
    inputs.property("version", project.version)
    inputs.property("fabricid", "s1mple-performance")

    filesMatching("fabric.mod.json") {
        expand(project.properties)
    }
}

tasks.jar {
    archiveFileName.set("S1MPLEPerformance-Client-${project.version}.jar")
}

tasks.register("printJarPath") {
    doLast {
        println(tasks.jar.get().archiveFile.get().asFile.absolutePath)
    }
}