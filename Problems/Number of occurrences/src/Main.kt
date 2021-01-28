fun solution(strings: List<String>, str: String): Int {
    // put your code here
    var occur = 0
    for (string in strings) {
        if (string == str) occur++
    }
    return occur
}