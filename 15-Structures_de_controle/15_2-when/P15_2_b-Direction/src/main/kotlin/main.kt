fun main() {
    val number = readln()
    println(when (number) {
        1-> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "right"
        else -> "do not move"
    })
}
