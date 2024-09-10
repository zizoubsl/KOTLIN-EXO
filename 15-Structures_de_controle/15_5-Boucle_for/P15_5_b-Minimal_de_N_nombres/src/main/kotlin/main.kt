fun main() {
    val nb = readln().toInt()
    val min = nb
    for (i in 1 ..nb) {
        var res = readln().toInt()
        if (res < min){
            min = res
    }
    }
    println(min)
}
