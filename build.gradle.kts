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
    implementation("org.hibernate:hibernate-entitymanager:5.5.7.Final")
}