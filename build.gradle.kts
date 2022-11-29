plugins {
    java
    `java-library`
}

repositories {
    mavenCentral()
}

ant.importBuild("nutch-1.19/build.xml") { oldTargetName ->
    when (oldTargetName) {
        "build" -> "ant_build"
        "init" -> "ant_init"
        "jar" -> "ant_jar"
        "test" -> "ant_test"
        "javadoc" -> "ant_javadoc"
        "clean" -> "ant_clean"
        else -> oldTargetName
    }
}

dependencies {

    implementation("com.zaxxer:HikariCP:4.0.3")   // For Java 8
    //implementation("com.zaxxer:HikariCP:5.0.1")   // For Java 11+
    implementation("org.hibernate:hibernate-entitymanager:5.5.7.Final")
    implementation("org.springframework.data:spring-data-jpa:2.3.9.RELEASE")
    val tbHome = System.getenv("TB_HOME")   // Read environment variable $TB_HOME from shell
    runtimeOnly(files("$tbHome/client/lib/jar/tibero7-jdbc.jar"))
}