package day4

object CreditCard extends App {
  def luhnsChecker(input:Long):Any={
    val cardNumber = input.toString.toCharArray.map(_.toString.toLong).toList.reverse
    val newCardNumber = cardNumber.zipWithIndex.map{
      case (number, index) =>
        if (index % 2 != 0){
          val luhnsNumber = number*2
          if (luhnsNumber>9) luhnsNumber-9 else luhnsNumber
        }
        else number
    }.sum
    val isValid= if (newCardNumber%10 == 0) println("Card is Valid")
    else  println("Card is invalid")
  }
  luhnsChecker(49927398716L)
}