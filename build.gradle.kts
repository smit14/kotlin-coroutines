plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.service"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // SLF4J API
    implementation("org.slf4j:slf4j-api:2.0.9")

    // Logback as the implementation of SLF4J
    implementation("ch.qos.logback:logback-classic:1.4.11")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}