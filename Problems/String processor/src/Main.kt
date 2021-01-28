import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val inA = scanner.nextLine()
    val operator = scanner.nextLine()
    val inB = scanner.nextLine()
    when (operator) {
        "equals" -> println(inA == inB)
        "plus" -> println(inA + inB)
        "endsWith" -> println(inA.endsWith(inB))
        else -> println("Unknown operation")
    }
}