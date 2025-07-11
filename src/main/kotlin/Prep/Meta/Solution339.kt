package Prep.Meta

import Prep.Meta.util.NestedInteger

class Solution339 {
    var res = 0
    fun depthSum(nestedList: List<NestedInteger>): Int {
        helper(nestedList, 1)
        return res
    }

    private fun helper(nestedList: List<NestedInteger>, depth: Int) {

        for (i in nestedList.indices) {
            if (nestedList[i].isInteger()) {
                res += nestedList[i].getInteger()!! * depth
            } else {
                helper(nestedList[i].getList()!!, depth + 1)
            }
        }
    }
}