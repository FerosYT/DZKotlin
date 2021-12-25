fun calcNullValues(input: Array<Int?>):Array<Int>{
    return arrayOf(input.count { it == null }, input.filterNotNull().sumBy { it })
}

fun main (args: Array<String>){
    calcNullValues(arrayOf(82, null, null, null, null, null, 7, 55))
}
