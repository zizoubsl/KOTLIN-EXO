class BankAccount(deposited: Long, Withdrawn: Long){

    var balance =deposited - Withdrawn

}



fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}