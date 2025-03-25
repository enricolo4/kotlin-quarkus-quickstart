rootProject.name ="kotlin-quarkus-quickstart"

include("main", "domain", "rest-server")
include("domain")
include("rest-server")
include("kafka-producer")

// PRIMARY
project(":rest-server").projectDir = file("primary/rest-server")

// SECONDARY
project(":kafka-producer").projectDir = file("secondary/kafka-producer")

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