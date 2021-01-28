import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val letters = mutableMapOf<Int, String>()
    var i = 0
    while (scanner.hasNextLine()) {
        letters[i] = scanner.nextLine()
        i++
        if (letters[i] == "z") break
    }
    if (i < 3) print("null") else print(letters[3])
}