import kotlin.math.pow

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double= x3, y4: Double=y3): Double {
    var a = 0.0
    val arrete01 =((x2-x1).pow(2.0) + (y2 - y1).pow(2.0)).pow(0.5)
    val arrete02 =((x3-x2).pow(2.0) + (y3 - y2).pow(2.0)).pow(0.5)
    val arrete03 =((x4-x3).pow(2.0) + (y4 - y3).pow(2.0)).pow(0.5)
    val arrete04 =((x1-x4).pow(2.0) + (y1 - y4).pow(2.0)).pow(0.5)

    return a

}

fun main() {
    println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0))
}