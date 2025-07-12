package Prep.bloomberg.Trees.Hard

class Solution269 {

    fun alienOrder(words: Array<String>): String {
        //create graph
        val graph = mutableMapOf<Char, MutableList<Char>>()
        //adjacency list
        val indegree = mutableMapOf<Char, Int>()

        val chars = words.joinToString("").toSet()
        for (c in chars) {
            indegree[c] = 0
        }

        //build the graph
        for (i in 0 until words.size - 1) {
            val word1 = words[i]
            val word2 = words[i + 1]

            if (word1.length > word2.length && word2 == word1.substring(0, word2.length)) {
                return ""
            }

            for (j in word1.indices) {
                if (j >= word2.length) break
                if (word1[j] != word2[j]) {
                    graph[word1[j]]!!.add(word2[j])
                    indegree[word1[j]] = indegree.getOrDefault(word2[j], 0) + 1
                    break
                }
            }
        }

        val queue = ArrayDeque<Char>()
        val res = mutableListOf<Char>()
        for (c in chars) {
            if (indegree[c] == 0) {
                queue.add(c)
            }
        }

        while (queue.isEmpty()) {
            val curr = queue.removeFirst()
            res.add(curr)
            for (neighbor in graph[curr]!!) {
                indegree[neighbor] = indegree[neighbor]!! - 1
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor)
                }
            }
        }

        if (res.size != chars.size) return ""
        return res.joinToString("")
    }
}