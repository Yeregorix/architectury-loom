import java.util.Properties

plugins {
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.serialization") version "1.7.22"
    id("dev.architectury.loom")
	`maven-publish`
}

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

group = "com.example"
version = "0.0.1"

dependencies {
	minecraft(group = "com.mojang", name = "minecraft", version = "1.16.5")
	mappings(group = "net.fabricmc", name = "yarn", version = "1.16.5+build.5", classifier = "v2")
	modImplementation("net.fabricmc:fabric-loader:0.12.12")
	modImplementation(group = "net.fabricmc", name = "fabric-language-kotlin", version = "1.8.7+kotlin.1.7.22")
}

publishing {
	publications {
		create<MavenPublication>("mavenKotlin") {
			from(components["java"])
		}
	}
}
