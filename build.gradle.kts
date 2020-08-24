import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
    id("org.openjfx.javafxplugin") version "0.0.9"
    maven
}

group = "ruckustboom"
version = "0.1.0"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation("ruckustboom:Palette:0.1.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

kotlin {
    explicitApi()
}

javafx {
    modules("javafx.controls", "javafx.fxml")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
    kotlinOptions.useIR = true
}

tasks {
    test {
        useJUnitPlatform()
    }
}
