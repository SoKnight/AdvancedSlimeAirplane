java {
    withJavadocJar()
}

dependencies {
    api("com.infernalsuite.aswm:api")

    api("net.kyori:adventure-nbt:4.7.0")
    compileOnlyApi("org.checkerframework:checker-qual:3.49.0")
}
