plugins {
    kotlin("jvm") version "2.0.20"
    kotlin("plugin.serialization") version "2.0.20"
}

group = "me.play"
version = "1.0-SNAPSHOT"

repositories {
    maven { url =uri("https://maven.aliyun.com/repository/public/") }
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(platform("io.arrow-kt:arrow-stack:1.2.4"))
    // no versions on libraries
    implementation("io.arrow-kt:arrow-core")
    implementation("io.arrow-kt:arrow-optics")
    implementation("io.arrow-kt:arrow-fx-coroutines")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
    implementation("io.github.reactivecircus.cache4k:cache4k:0.13.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
