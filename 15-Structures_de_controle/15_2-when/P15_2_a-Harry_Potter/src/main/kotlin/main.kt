fun main() {
    val str = readln()
    println(when (str) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" ->"intellect"
        else -> "not a valid house"

    })
}
