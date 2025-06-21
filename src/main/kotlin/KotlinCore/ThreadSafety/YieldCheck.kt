package KotlinCore.ThreadSafety

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() = runBlocking {
    val job = launch {
        repeat(5) { i ->
            println("Coroutine working on iteration $i")
            yield() // Yield control to other coroutines
        }
    }

    val anotherJob = launch {
        repeat(5) { j ->
            println("Another coroutine working on iteration $j")
            delay(100) // Simulate some work
        }
    }

    job.join()
    anotherJob.join()
}

