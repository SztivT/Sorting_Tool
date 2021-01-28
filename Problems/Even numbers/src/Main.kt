fun solution(numbers: List<Int>) {
    // put your code here
    for (n in numbers) {
        if (n % 2 == 0) {
            print(n)
            if (n != numbers[numbers.lastIndex]) print(" ")
        }
    }
}