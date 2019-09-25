package day1

object Iteration2 extends App {
  def multiplePrints(text:String,x:Int):Unit= {
    val newText = text*x
    if(x>1) multiplePrints(text, x-1)
    println(newText)
  }
  multiplePrints("H", 5)
}