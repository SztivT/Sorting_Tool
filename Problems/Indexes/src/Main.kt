fun solution(products: List<String>, product: String) {
    // put your code here
    for (i in products.indices) {
        if (products[i] == product) {
            print(i)
            if (i != products.lastIndex) print(" ")
        }

    }
}