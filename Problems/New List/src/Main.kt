fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    // put your code here
    val retList = mutableListOf<Int>()
    for (n in numbers) retList.add(n)
    retList.add(number)
    return retList
}