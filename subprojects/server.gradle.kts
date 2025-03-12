dependencies {
    implementation(projects.advancedslimeairplaneApi)
    implementation("com.infernalsuite.aswm:core")

    implementation("com.destroystokyo.paper:paper-mojangapi:1.16.5-R0.1-SNAPSHOT") {
        exclude("com.destroystokyo.paper", "paper-api")
    }

    implementation("net.kyori:option:1.1.0")

    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")
}
