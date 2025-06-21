package KotlinCore.ThreadSafety

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

var counter = 0
val mutex = Mutex()

fun main() = runBlocking {
    val job1 = launch {
        repeat(10) {
            println("Inside job1")
            mutex.withLock { counter++ }
        }
    }

    val job2 = launch {
        repeat(10) {
            println("Inside job2")
            mutex.withLock { counter++ }
        }
    }

    job1.join()
    job2.join()

    println("counter ---> $counter")
}