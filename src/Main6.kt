fun calculateEvenDigits(input: String): Int {
    var sum: Int = 0
    var temp: Int = 0
    for (x in input) {
        temp = x.toString().toInt()
        if (temp % 2 == 0) sum += temp
    }
    return sum
}

fun main (args: Array<String>){
print(calculateEvenDigits("1243"))
}