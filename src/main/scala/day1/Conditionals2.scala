package day1

object Conditionals2 extends App{
  def sumOf(value1:Int,value2:Int,value3:Boolean):Int=
    if(value1== 0) value2 else if(value2== 0) value1 else if (value3==true) value1+value2 else value1*value2
  println(sumOf(0,0, false))
}