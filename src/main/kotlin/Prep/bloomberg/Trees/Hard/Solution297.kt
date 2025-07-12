package Prep.bloomberg.Trees.Hard

import Prep.epam.TreeNode

class Solution297 {

    fun serialize(root: TreeNode?): String {
        val serializedList = mutableListOf<String>()

        fun dfs(root: TreeNode?) {
            if (root == null) {
                serializedList.add("null")
                return
            }
            serializedList.add(root.`val`.toString())
            dfs(root.left)
            dfs(root.right)
        }

        return serializedList.joinToString(",")
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        var index = 0
        val deserializedList = data.split(",").toMutableList()

        fun dfs(): TreeNode? {
            if (index >= deserializedList.size || deserializedList[index] == "null") {
                index++
                return null
            }
            val root = TreeNode(deserializedList[index].toInt())
            index++
            root.left = dfs()
            root.right = dfs()
            return root
        }

        return dfs()
    }
}