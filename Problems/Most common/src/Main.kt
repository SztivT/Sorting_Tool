import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val words = mutableMapOf<String, Int>()
    while (scanner.hasNextLine()) {
        val word = scanner.nextLine()
        if (!words.containsKey(word)) words[word] = 1 else words[word] = words[word]!!.plus(1)
        if (word == "stop") break
    }
    var maxOccurWord = ""
    var maxOccurTimes = 0
    for ((key, value) in words) {
        if (value > maxOccurTimes) {
            maxOccurTimes = value
            maxOccurWord = key
        }
    }
    if (maxOccurWord == "stop") print("null") else print(maxOccurWord)
}