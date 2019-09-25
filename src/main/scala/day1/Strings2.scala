package day1

object Strings2 extends App {
  def stringMaker(string1: String, string2: String, find:Char, replace: Char): String =
    (string1 + string2).map(elem => if (elem.equals(find)) replace else elem)
  println(stringMaker("ha", "llo", 'a', 'e'))
}


