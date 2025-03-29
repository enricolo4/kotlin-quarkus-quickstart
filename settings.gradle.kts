rootProject.name ="kotlin-quarkus-quickstart"

include("main", "domain")
include("rest-server", "kafka-consumer")
include("kafka-producer", "postgres")

// PRIMARY
project(":rest-server").projectDir = file("primary/rest-server")
project(":kafka-consumer").projectDir = file("primary/kafka-consumer")

// SECONDARY
project(":kafka-producer").projectDir = file("secondary/kafka-producer")
project(":postgres").projectDir = file("secondary/postgres")

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