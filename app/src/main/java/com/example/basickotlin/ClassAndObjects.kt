
class BankAccount(val owner: String,val initialBalance: Double=0.0){
    var balance: Double=initialBalance
        private set

    val isEmpty: Boolean get() = balance==0.0
    init {
        require(initialBalance >= 0){
           "Initial balance can not be negative"
        }
    }
    fun deposite(amount: Double){
        require(amount > 0){
            "Deposite must be positive"
        }
        balance+=amount
    }
    fun withdraw(amount: Double) : Boolean {
        if(amount > balance) return false
        balance -=amount
        return true
    }

    override fun toString()= "$owner $balance"

}
fun main(){
    val ac = BankAccount("Ankit")
    ac.deposite(800.0)
    println(ac.withdraw(200.0))
    println(ac.withdraw(200.0))
    println(ac)
}
