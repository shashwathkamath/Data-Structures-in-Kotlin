package Prep.leetcode150.Stacks

class Solution71 {


    fun simplifyPath(path: String): String {
        val components = path.split("/").filter { it.isNotEmpty() && it != "." }
        val st = ArrayDeque<String>()

        for (component in components) {
            when {
                component == ".." -> st.removeLastOrNull()
                else -> st.addLast(component)
            }
        }

        return "/" + st.joinToString("/")
    }
}