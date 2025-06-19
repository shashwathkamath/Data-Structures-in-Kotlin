package Prep

import Prep.epam.Solution1

fun main() {

    Solution1().twoSum(
        intArrayOf(2, 7, 11, 15),
        9
    )

}

fun createHelloWorld(name: String): () -> String {
    return { "Hello $name" }
}
