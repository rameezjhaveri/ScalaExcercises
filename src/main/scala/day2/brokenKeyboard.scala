package day2

import scala.util.matching.Regex

object brokenKeyboard extends App {
  import scala.io.Source

    val html = Source.fromURL("http://norvig.com/ngrams/enable1.txt")
    val dictionary = html.mkString.toList
      html.close()
//    println(dictionary)
  def anagramSolver(lines:Int,text:String):Unit= {
    dictionary.filter(_ match ["abc"]+)
//    val userWord = new Regex("[text]+")
//    println((userWord findAllIn dictionary).mkString(","))


  }
  anagramSolver(1,"hello")
}
