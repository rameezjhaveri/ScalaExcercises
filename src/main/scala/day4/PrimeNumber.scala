package day4

import scala.collection.mutable.ListBuffer

object PrimeNumber extends App {
  var listOfPrimes: Int = 0
  def isPrime(n: Int): Boolean = (2 to (n - 1)).forall(n % _ != 0)

  def searchPrime(n: Int, until: Int, found: Int): Int = {
    if (found == until) return (n - 1)
    if (isPrime(n)) {
      listOfPrimes += 1
      println(n)
      searchPrime(n + 1, until, found + 1)
    }
    else {
      searchPrime(n + 1, until, found)
    }
  }

  def nth(n: Int) = searchPrime(2, n, 0)

  println(nth(1000000))
}