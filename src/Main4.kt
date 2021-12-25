fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    val x = (dayNumber * bugRank + 42) * cashAmount
    return x
}
fun main (args: Array<String>){
    print(calcBugMoneyValue(10,2,5))
}