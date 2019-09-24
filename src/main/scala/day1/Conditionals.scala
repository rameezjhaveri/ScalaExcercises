package day1

object Conditionals extends App {
  def sumOf(value1:Int,value2:Int,value3:Boolean):Int=if(value3==true) value1+value2 else value1*value2

  //True = addition
  //False = Multiplication

  println(sumOf(3,5, false))
}