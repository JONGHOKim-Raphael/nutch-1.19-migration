plugins {
    "java-library"
}

//ant.importBuild("build.xml")

ant.importBuild("build.xml") { oldTargetName ->
    if (oldTargetName == "build") "ant_build"
    if (oldTargetName == "init") "ant_init"
    else oldTargetName
}

