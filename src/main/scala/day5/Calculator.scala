package day5

object Calculator extends App {
  def maths(number1:Int, number2:Int, operator:String):Any= (operator) match{
    case "+" => number1 + number2

    case "-" => number1 - number2

    case "*" => if (number1==0 || number2 == 0) 0
      else number1*number2

    case "/" => if (number1 == 0) 0
      else if (number2 == 0) println("Undefined")
      else (number1/number2)
  }

  println(maths(10,0,"/"))
}
