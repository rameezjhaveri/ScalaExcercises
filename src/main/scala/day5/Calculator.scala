package day5

object Calculator extends App {
  def maths(number1:Int, number2:Int, operator:String):Any= (operator) match{
    case "+" => number1 + number2
    case "-" => number1 - number2
    case "*" => number1 * number2
    case "/" => number1 / number2
  }
}
