package day4

import scala.concurrent.Future
import scala.concurrent._
import ExecutionContext.Implicits.global

object PrimeNumber extends App {
  val lowerLimit = 99999
  val upperLimit = 1000000
  var listToCheck = (lowerLimit to upperLimit by 2).toList
  var divisor = 3
  val numberOfThreads = 4
  def sleep(time:Long) {Thread.sleep(time)}

  def time[R](block: => R): R = {
    val startTime = System.currentTimeMillis()
    val result = block
    val endTime = System.currentTimeMillis()
    println("Elapsed time: " + (endTime - startTime) + "ms")
    result
  }

  def primeFinder(max:Int):Any= {
    if (divisor*divisor <= upperLimit) {
      listToCheck = listToCheck.filter(_ % divisor != 0)
      divisor += 1
      primeFinder(upperLimit)
    }
    else println(listToCheck.length)
  }

  def concurrency(numberOfThreads:Int):Any= {
  }

  time {primeFinder(1)}
  sleep(500)
}