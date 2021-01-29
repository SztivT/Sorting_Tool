enum class Rainbow(val color: String, val nr: Int) {
    RED("RED", 1),
    ORANGE("ORANGE", 2),
    YELLOW("YELLOW", 3),
    GREEN("GREEN", 4),
    BLUE("BLUE", 5),
    INDIGO("INDIGO", 6),
    VIOLET("VIOLET", 7)
}

fun main() {
    val color = readLine()!!
    // put your code here
    val rainbowColor = Rainbow.valueOf(color.toUpperCase())
    println(rainbowColor.nr)
}
