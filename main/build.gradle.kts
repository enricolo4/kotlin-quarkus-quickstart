private val primary = listOf(":rest-server")
private val secondary = emptyList<String>()
private val projects = listOf(":domain") + primary + secondary

dependencies {
    implementation(project(":domain"))
    implementation(project(":rest-server"))
}