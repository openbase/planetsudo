import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    application
    `maven-publish`
    signing
    kotlin("jvm") version "1.9.22"
    id("org.jlleitschuh.gradle.ktlint") version "11.6.1"
}

group = "org.openbase"
description = "PlanetSudo is a reactive multi agent simulation game. This package can be used to prototype the artificial intelligence for a new team."

repositories {
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

dependencies {
    implementation(libs.org.openbase.planetsudo.engine)
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(libs.junit.junit)
}

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

tasks.build {
    dependsOn("ktlintFormat")
}

tasks.register<Copy>("copyPreCommitHook") {
    description = "Copy pre-commit git hook from utils to the .git/hooks folder."
    group = "git hooks"
    outputs.upToDateWhen { false }
    from("$rootDir/.git-utils/pre-commit")
    into("$rootDir/.git/hooks/")
}

ktlint {
    disabledRules.set(setOf("no-wildcard-imports"))
    filter {
        exclude { entry -> entry.file.toString().contains("generated") }
    }
    reporters {
        reporter(ReporterType.PLAIN)
        reporter(ReporterType.HTML)
        reporter(ReporterType.CHECKSTYLE)
    }
}

application {
    mainClass.set("org.openbase.planetsudo.main.PlanetSudo")
}
