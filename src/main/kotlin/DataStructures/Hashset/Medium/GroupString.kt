fun groupStrings(strings: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, MutableList<String>>()

    for (str in strings) {
        val pattern = generatePatt(str)
        map.getOrPut(pattern) { mutableListOf<String>() }.add(str)
    }

    return map.values.toList()
}

fun generatePatt(str: String): String {
    if (str.length == 1) return "0"

    val map = mutableMapOf<Char, Int>()

    var pattern = StringBuilder()

    for (i in 1 until str.length) {
        val diff = (str[i] - str[i - 1] + 26) % 26
        pattern.append(diff).append(",")
    }

    return pattern.toString()
}
