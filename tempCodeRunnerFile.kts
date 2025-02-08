tasks.register("compileAndRun") {
    group = "custom"
    description = "Builds and runs the Kotlin project"
    doLast {
        exec {
            commandLine("./gradlew", "build")
        }
        exec {
            commandLine("./gradlew", "run")
        }
    }
}