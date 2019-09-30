package day5.calculator

object Calculator extends App {
  def sum(number1:Int, number2:Int, operator:String):Any= (operator) match{
    case "+" => number1 + number2
    case "-" => number1 - number2
    case "*" => number1 * number2
  }
}
