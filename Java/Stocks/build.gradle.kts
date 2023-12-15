plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.javalin:javalin:5.6.1")
    implementation("com.google.inject:guice:5.1.0")
    implementation("org.slf4j:slf4j-simple:2.0.7")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.3")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("org.apache.httpcomponents:httpclient:4.5.14")
    implementation("org.mapstruct:mapstruct:1.4.2.Final")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.0")

    compileOnly("org.projectlombok:lombok:1.18.24")

    annotationProcessor("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.4.2.Final")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}