/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
    signing
    kotlin("jvm")
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
    mavenCentral()
}

dependencies {
    implementation(libs.org.openbase.planetsudo.engine)
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(libs.junit.junit)
}

group = "org.openbase"
version = "4.0.0-SNAPSHOT"
description = "PlanetSudo is a reactive multi agent simulation game. This package can be used to prototype the artificial intelligence for a new team."

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
kotlin {
    jvmToolchain(17)
}
