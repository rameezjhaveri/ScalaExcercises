package day1

object Iteration extends App {
val start = 1
  def multiplePrints(text:String,x:Int):Unit= {
  if(x>start) multiplePrints(text, x-1)
    println(text)
  }

  multiplePrints("Hi", 3)
}