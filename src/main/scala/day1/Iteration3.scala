package day1

object Iteration3 extends App {
    def fizzBuzz(fizz: String, buzz: String, max: Int) = {
       1 to max foreach ( x => {
         val a = x % 3 == 0
         val b = x % 5  == 0
         if (a && b) println(fizz.concat(buzz))
         else if (a) println(fizz)
         else if (b) println(buzz)
         else println(x)
       }
      )
  }
  fizzBuzz("Fizz", "Buzz", 15)
}