fun getYearEra(year: Int): String{
    var era: String =
        when {
            year < 1970 -> "до"
            year == 1970 -> "соответствует"
            year in 1971..1999 -> "после (XX век)"
            year in 2000..2099 -> "после (XXI век)"
            else -> "далёкое будущее"
        }
    return era
}
fun main (args: Array<String>){
    print("1915 - " + getYearEra(1915))
    print("\n1995 - " + getYearEra(1995))
    print("\n1970 - " + getYearEra(1970))
    print("\n2097 - " + getYearEra(2097))
    print("\n3000 - " + getYearEra(3000))
}