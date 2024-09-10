fun main() {
    val a = readln().toInt()
    if (2%a == 0) {
        println("$a est divisible par 2")
    }
    if (3%a ==0) {
        println("$a est divisible par 3")
    }
    if (5%a ==0){
        println("$a est divisible par 5")
    }
    else {
        println("$a est divisible par 6")
    }
}