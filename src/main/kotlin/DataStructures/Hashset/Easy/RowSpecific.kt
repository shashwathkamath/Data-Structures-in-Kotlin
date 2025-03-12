fun rowSpecificWords(words: List<String>): List<String>? {
    val firstRow: Set<Char> = setOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
    val secondRow: Set<Char> = setOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
    val thirdRow: Set<Char> = setOf('z', 'x', 'c', 'v', 'b', 'n', 'm')

    for (word in words) {
        checkForRows(word)
    }
    return null
}

fun checkForRows(word: String) {}
