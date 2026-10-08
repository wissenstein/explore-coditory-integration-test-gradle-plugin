plugins {
    kotlin("jvm") version "2.4.20"
    id("com.coditory.integration-test") version "2.2.5"
}

group = "com.wissenstein"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}
