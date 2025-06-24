fun main() {
    val printer = SimplePrinter()
    val advancedPrinter = AdvancedPrinter(printer)
    advancedPrinter.print()
}

interface Printer {
    fun print()
}

class SimplePrinter : Printer {
    override fun print() {
        print("A simple printer is implemented")
    }
}

class AdvancedPrinter(printer: Printer) : Printer by printer