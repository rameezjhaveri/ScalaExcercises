package day1

object Iteration extends App {
val start = 1
  def multiplePrints(text:String, numOfPrints:Int):Unit= {
  if(numOfPrints>start) multiplePrints(text, numOfPrints-1)
    println(text)
  }

  multiplePrints("Hi", 3)
}