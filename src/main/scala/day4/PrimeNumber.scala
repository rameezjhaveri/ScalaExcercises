package day4

import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global

object PrimeNumber extends App {
  var lowerLimit = 1000000
  val upperLimit = 3000000
  var listToCheck = (lowerLimit to upperLimit by 2).toList
  var divisor = 2
  val numberOfThreads = 4

  def sleep(time:Long) {Thread.sleep(time)}

  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block
    val t1 = System.currentTimeMillis()
    println("Elapsed time: " + (t1 - t0) + "ms")
    result
  }

  def primeFinder(max:Int):Any= {
    if (divisor*divisor < max) {
      divisor += 1
      listToCheck = listToCheck.filter(_ % divisor != 0)
      primeFinder(upperLimit)
    }
    else println(listToCheck.length)
  }

  def concurrency(numberOfThreads:Int):Any= {
  }

  time {primeFinder(3000000)}
  sleep(500)
}