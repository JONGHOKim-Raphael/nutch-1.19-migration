plugins {
    "java-library"
}

ant.importBuild("nutch-1.19/build.xml") { oldTargetName ->
    if (oldTargetName == "build") "ant_build"
    if (oldTargetName == "init") "ant_init"
    else oldTargetName
}

