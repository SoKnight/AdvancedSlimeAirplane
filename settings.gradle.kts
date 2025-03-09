import xyz.jpenilla.toothpick.setupToothpickProject

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("toothpick")

    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://repo.jpenilla.xyz/snapshots")
    }
}

plugins {
    id("xyz.jpenilla.toothpick.settings") version "1.1.0+patch.1"
    id("org.gradle.toolchains.foojay-resolver") version "0.9.0"
}

includeBuild("AdvancedSlimePaper")

rootProject.name = "AdvancedSlimeAirplane"
setupToothpickProject(rootProject, rootProject.name)