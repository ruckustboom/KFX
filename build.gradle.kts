plugins {
    kotlin("jvm") version "2.2.20"
    id("org.openjfx.javafxplugin") version "0.1.0"
    id("maven-publish")
}

group = "ruckustboom"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    explicitApi()
    jvmToolchain(22)
}

javafx {
    version = "24.0.1"
    modules("javafx.controls", "javafx.fxml")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
