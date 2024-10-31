plugins {
    id("org.jetbrains.intellij") version "1.11.0"
}

group = "pers.wjx.plugin"
version = "1.0"

repositories {
    mavenLocal()
    mavenCentral()
}

intellij {
    version.set("2023.3.4")
    updateSinceUntilBuild.set(false)
}

tasks {
    patchPluginXml {
        version.set("${project.version}")
        sinceBuild.set("203")
    }
}