plugins {
    java
    id("xyz.jpenilla.toothpick")
}

toothpick {
    forkName = "AdvancedSlimeAirplane"
    groupId = "me.soknight"
    val versionTag = System.getenv("BUILD_NUMBER") ?: commitHash() ?: error("Could not obtain git hash")
    forkVersion = "git-$forkName-$versionTag"
    forkUrl = "https://github.com/SoKnight/AdvancedSlimeAirplane"

    minecraftVersion = "1.16.5"
    nmsPackage = "1_16_R3"
    nmsRevision = "R0.1-SNAPSHOT"

    upstream = "Airplane"
    upstreamBranch = "origin/ver/1.16"

    paperclipName = "AdvancedSlimeAirplane-paperclip"

    api {
        project = project(":$forkNameLowercase-api")
        patchesDir = file("patches/api")
    }

    server {
        project = project(":$forkNameLowercase-server")
        patchesDir = file("patches/server")
    }
}

subprojects {
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://repo.aikar.co/content/groups/aikar/")
        maven("https://nexus.velocitypowered.com/repository/velocity-artifacts-snapshots/")
        maven("https://libraries.minecraft.net/")
        maven("https://jitpack.io/")
        mavenLocal()
    }

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }
}
