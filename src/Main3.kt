fun calcChairs(bugs: Int) = bugs+bugs/2

fun main (args: Array<String>){
    val empty = ", "
    print(calcChairs(44))
    print(empty)
    print(calcChairs(70))
    print(empty)
    print(calcChairs(6))
    print(empty)
    print(calcChairs(12))
    print(empty)
    print(calcChairs(0))
    print(empty)
    print(calcChairs(1))
}