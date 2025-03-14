package DataStructures.Stack.Medium

class Stack(private val capacity:Int) {
   private val arr = IntArray(capacity)
    private var topIndex1 = -1
    private var topIndex2 = capacity

    fun top1():Int{
        if (topIndex1 == -1){
            return -1
        }
        return arr[topIndex1]
    }

    fun top2():Int{
        if (topIndex2 == -1){
            return -1
        }
        return arr[topIndex2]
    }

    fun push1(element:Int):Boolean{
        if (topIndex1 >= topIndex2){
            return false
        }
        topIndex1++
        arr[topIndex1] = element
        return true
    }

    fun push2(element:Int):Boolean{
        if (topIndex2-1 <= topIndex1){
            return false
        }
        topIndex2--
        arr[topIndex2] = element
        return true
    }

    fun pop1():Int{
        if (topIndex1 == -1){
            return -1
        }
        val elementToRemove = arr[topIndex1]
        topIndex1--
        return elementToRemove
    }

    fun pop2():Int{
        if (topIndex2 == -1){
            return -1
        }
        val elementToRemove = arr[topIndex2]
        topIndex2++
        return elementToRemove
    }
}