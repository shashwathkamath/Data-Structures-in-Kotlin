fun main() {

}

interface Processor<Input, Output> {
    fun process(input: Input): Output
}

class StringToLengthProcessor : Processor<Int, String> {
    override fun process(input: Int): String {
        TODO("Not yet implemented")
    }
}

class NumberToStringProcessor : Processor<String, Int> {
    override fun process(input: String): Int {
        TODO("Not yet implemented")
    }
}