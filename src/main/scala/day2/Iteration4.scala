package day2

object Iteration4 extends App {

  //Iteration1 with using only recursion
  val start = 1
  def multiplePrints1(text:String, numOfPrints:Int):Unit= {
    if(numOfPrints>start) multiplePrints1(text, numOfPrints-1)
    println(text)
  }
  multiplePrints1("Hi", 3)


  //Iteration2 with using only recursion
  def multiplePrints2(text:String,x:Int):Unit= {
    val newText = text*x
    if(x>1) multiplePrints2(text, x-1)
    println(newText)
  }
  multiplePrints2("H", 5)


  //Iteration3 with using only recursion
  def fizzBuzz(fizz: String, buzz: String, max: Int) = {
    1 to max foreach ( elem => {
      val divByThree = elem % 3 == 0
      val divByFive = elem % 5  == 0
      if (divByThree && divByFive) println(fizz.concat(buzz))
      else if (divByThree) println(fizz)
      else if (divByFive) println(buzz)
      else println(elem)
    }
      )
  }
  fizzBuzz("Fizz", "Buzz", 15)

}
