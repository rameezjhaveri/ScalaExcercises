package day1

object Iteration3 extends App {
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