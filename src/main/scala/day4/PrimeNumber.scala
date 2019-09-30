package day4

object PrimeNumber extends App {

  var listToCheck = 3 to 2000 by 2
  var filter = 2
  def primeFinder(upperLimit:Int):Any= {
    listToCheck.map(numb => {
      if (filter * filter > 2000000) listToCheck
      else {
        filter += 1
       if (numb % filter == 0) listToCheck
      }
    })
  }
  listToCheck.foreach(x=>println(x))
//  println(listToCheck)
}

