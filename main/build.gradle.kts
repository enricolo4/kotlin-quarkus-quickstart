private val primary = listOf(":rest-server", ":kafka-consumer")
private val secondary = listOf(":kafka-producer", ":postgres")
private val projects = listOf(":domain") + primary + secondary

dependencies {
    projects.forEach { implementation(project(it)) }
}

tasks.named("quarkusDependenciesBuild") {
    dependsOn(tasks.named("jandex"))
}