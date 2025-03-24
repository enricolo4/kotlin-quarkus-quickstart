rootProject.name ="kotlin-quarkus-quickstart"

include("main", "domain", "rest-server")
include("domain")
include("rest-server")

project(":rest-server").projectDir = file("primary/rest-server")

pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion apply false
        id("org.kordamp.gradle.jandex") version "2.1.0"
    }
}