class Box(var height: Double, var width: Double, var length: Double) {

    fun getVolume(){

    }
}


fun main() {
    val myBox = Box(10.0, 20.0, 50.0)
    println(myBox.getVolume())
}