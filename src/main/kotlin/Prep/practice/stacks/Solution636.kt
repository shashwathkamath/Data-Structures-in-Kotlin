package Prep.practice.stacks

class Solution636 {

    fun exclusiveTime(n: Int, logs: List<String>): IntArray {
        val st = ArrayDeque<task>()
        var arr = mutableListOf<Int>()

        for (eachLog in logs) {
            val log = eachLog.split(":")
            val t = task(log[0].toInt(), log[1], log[2].toInt(), 0)
            if (t.status == "start") {
                if (st.isNotEmpty()) {
                    val previousTask = st.removeLast()
                    val timeTaken = t.timeStamp - previousTask.timeStamp
                    previousTask.timeTaken = timeTaken
                    st.addLast(previousTask)
                }
                st.addLast(t)
            } else {
                val currentTask = st.removeLast()
                if (currentTask.id == t.id) {
                    val totalUnits = t.timeStamp - currentTask.timeStamp + t.timeTaken
                    arr.add(totalUnits)
                }
            }
        }

        return arr.reversed().toIntArray()
    }

    data class task(val id: Int, val status: String, val timeStamp: Int, var timeTaken: Int)
}