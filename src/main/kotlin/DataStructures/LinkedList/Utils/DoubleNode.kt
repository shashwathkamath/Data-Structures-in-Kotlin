data class DoubleNode<T>(
        var data: T,
        var prev: DoubleNode<T>? = null,
        var next: DoubleNode<T>? = null
)
