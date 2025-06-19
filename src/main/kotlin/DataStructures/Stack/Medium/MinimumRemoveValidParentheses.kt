package DataStructures.Stack.Medium

fun minRemoveToMakeValid(s: String): String {
    var result = removeParanthesis(s, '(', ')')
    result = removeParanthesis(result.reversed().toString(), ')', '(')
    return result.reversed().toString()
}

fun removeParanthesis(s: String, open: Char, close: Char): StringBuilder {
    var balance = 0
    val sb = StringBuilder()
    for (c in s) {
        if (c == open) {
            balance++
        }
        if (c == close) {
            if (balance == 0) continue
            else balance--
        }
        sb.append(c)
    }
    return sb
}