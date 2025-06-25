package Prep.easy.Math

class Solution412 {

    fun fizzBuzz(n: Int): List<String> {
        val res = mutableListOf<String>()

        for (i in 1..n) {
            res.add(
                when {
                    i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                    i % 3 == 0 -> "Fizz"
                    i % 5 == 0 -> "Buzz"
                    else -> i.toString()
                }
            )
        }
        return res
    }
}

/**
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */

/*
 when {
                    i % 3 == 0 && i % 5 == 0 -> res[i] = "FizzBuzz"
                    i % 3 == 0 -> {
                        res[i] = "Fizz"
                    }

                    i % 5 == 0 -> {
                        res[i] = "Buzz"
                    }

                    else -> {
                        res[i] = i.toString()
                    }
                }
 */