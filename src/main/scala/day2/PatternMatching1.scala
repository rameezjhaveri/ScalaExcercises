package day2

object PatternMatching1 extends App {


  //Conditionals1 using pattern matching
  def sumOf(number1:Int, number2:Int, operator1:Boolean):Int= operator1 match {
      case true => number1 + number2
      case false => number1 * number2
  }
  println(sumOf(3,5, false))


  //Conditionals2 using pattern matching
  def newSumOf(value1:Int, value2:Int, operator2:Boolean):Int=
    if(value1== 0) value2 else if(value2== 0) value1 else operator2 match {
    case true => value1 + value2
    case false => value1 * value2
  }
  println(newSumOf(0,5, false))
}
