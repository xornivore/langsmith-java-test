plugins {
    kotlin("jvm") version "1.9.24"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // LangSmith Java SDK - published version from Maven Central
    implementation("com.langchain.smith:langsmith-java:0.1.0-alpha.12")

    // Jackson for JSON handling
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4")
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(9)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_9)
    }
}

application {
    mainClass = "com.langchain.smith.example.ListRunsExampleKt"
}

// Export stdin to examples for readln()
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

