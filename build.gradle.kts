
group = "ru.ifmo.pds"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.9.22"
    application
}

application.mainClass.set("consensus.VisualiseKt")

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.2.9")
    testImplementation(kotlin("test-junit"))
}

sourceSets["main"].java.setSrcDirs(listOf("src"))
sourceSets["test"].java.setSrcDirs(listOf("test"))
