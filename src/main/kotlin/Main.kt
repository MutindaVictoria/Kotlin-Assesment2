fun main() {
multiply()
    var person =CurrentAccount("1234567", "Bernard Mutinda", 12000.00, )

println(person.deposit(12000.0))
  println(person.withdraw(19000.0))
    println(person.details("Bernard Mutinda"))

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
//fun statement(word:String):Char



//Question3

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 an 8 it should print out “Bingo!” (5pts)
fun multiply(){
    for (item in 1..1000){
        if (item%6==0 && item%8==0)
            println("Bingo!")
    }
}
//Question4

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)


class CurrentAccount(var accountnumber: String, var accountname: String, var balance: Double) {

    fun deposit(amount: Double): Double {
        var deposit = 12000.00
        deposit = deposit.plus(balance)
        return deposit
    }


    ///b. withdraw(amount: Double) - Decrements the balance by the amount
////withdrawn
    fun withdraw(amount: Double): Double {
        var withdraws = 5000.0
        var balance = 24000.0
        balance -= withdraws
        return withdraws
    }

    //c. details() - Prints out the account number and balance and name in
////this format: “Account number x with balance y is operated by z”
    fun details(accountname: String) {
        var accountnumber = "1234567"
        var balance: Double = 5000.0
        println("$accountnumber with$balance, is operated by $accountname")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

//lass savingAccount(var accountnumber:String,var accountname: String,var balance:Double,var Withdrawals:Int){
   // fun savingsAcoountWithdraw(){
       // var withdrawals=0
    //    for(i in withdrawals)
    //    if(i<4) {
          //   balance+=withdrawals
      //  }
   // }
