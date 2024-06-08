plugins {
    java
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    id("com.google.cloud.tools.jib") version "3.4.3"
}

jib {
    to{
        image = "abc-jib"
    }
}
//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(17)
//    }
//}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
