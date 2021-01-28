fun solution(first: List<Int>, second: List<Int>): MutableList<Int> {
    // put your code here
    val retList = mutableListOf<Int>()
    for (y in first) retList.add(y)
    for (y in second) retList.add(y)
    return retList
}