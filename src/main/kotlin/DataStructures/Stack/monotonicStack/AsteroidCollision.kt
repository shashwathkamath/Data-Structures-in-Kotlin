package DataStructures.Stack.monotonicStack

import java.util.*
import kotlin.math.abs

private val Int.isNegative: Boolean
    get() = this < 0

data class Asteroid(val num: Int, val isNegative: Boolean)

fun asteroidCollision(asteroids: IntArray): IntArray {
    val st = Stack<Asteroid>()
    val res = mutableListOf<Int>()
    //[10,2,-5,-6]

    for (each in asteroids) {
        val sign = each.isNegative
        if (sign) {
            val current = st.pop()
            if (!current.isNegative) {
                when {
                    current.num > abs(each) -> {
                        st.push(current)
                    }

                    current.num < abs(each) -> {
                        st.push(Asteroid(abs(each), true))
                    }

                    else -> st.push(Asteroid(0, false))
                }
            } else {
                st.push(Asteroid(each, true))
            }
        } else {
            st.push(Asteroid(each, false))
        }
    }

    return res.toIntArray()
}