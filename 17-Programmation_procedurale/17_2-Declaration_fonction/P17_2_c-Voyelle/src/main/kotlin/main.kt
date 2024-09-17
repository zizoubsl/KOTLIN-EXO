    val m = listOf('a','e','i','o','u')

    fun isVowel(letter: Char): Boolean{
        if (letter in m){
            return true

        }
        else
            return false
    }




fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
