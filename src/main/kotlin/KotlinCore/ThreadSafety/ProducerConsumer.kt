package KotlinCore.ThreadSafety

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.produceNumbers(): ReceiveChannel<Int> = produce {
    for (i in 1..5) {
        send(i)
        delay(500)
    }
}

fun main() = runBlocking {
    val numbers = produceNumbers()
    numbers.consumeEach { value ->
        println("Consumed $value")
        delay(100)
    }
    println("Done consuming")
}