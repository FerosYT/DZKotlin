class SugarStorage(var volume:Int = 0) {
    fun increaseSugar(v:Int) { if (v >= 0) volume += v }
    fun decreaseSugar(v:Int) { if (v >= 0) if (volume - v < 0) volume = 0 else volume -= v }
}