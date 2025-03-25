private val primary = listOf(":rest-server")
private val secondary = listOf(":kafka-producer")
private val projects = listOf(":domain") + primary + secondary

dependencies {
    projects.forEach { implementation(project(it)) }
}