package DataStructures.Hashset.Medium

import kotlin.random.Random

class RandomizedSet {

    private val map = mutableMapOf<Int, Int>()
    private val list = mutableListOf<Int>()

    fun insert(`val`: Int): Boolean {
        if (map.containsKey(`val`)) return false
        map[`val`] = list.size
        list.add(`val`)
        return true
    }

    fun remove(`val`: Int): Boolean {
        if (!map.containsKey(`val`)) return false
        val index = map[`val`]!!
        val lastElement = list[list.size-1]
        list[index] = lastElement
        list.removeLast()
        map[lastElement] = index
        map.remove(`val`)
        return true
    }

    fun getRandom(): Int {
        return list[Random.nextInt(list.size)]
    }
}