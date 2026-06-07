package Prep.trending.amazon

class Solution1152 {

    fun mostVisitedPattern(
        username: Array<String>,
        timestamp: IntArray, website: Array<String>
    ): List<String> {

        val visits = mutableListOf<Visit>()
        for (i in username.indices) {
            visits.add(
                Visit(
                    username[i],
                    timestamp[i],
                    website[i]
                )
            )
        }

        visits.sortWith(compareBy { it.time })
        val userToWebsite = mutableMapOf<String, MutableList<String>>()
        for (visit in visits) {

        }
        return emptyList()
    }

    data class Visit(
        val userName: String,
        val time: Int,
        val website: String
    )
}