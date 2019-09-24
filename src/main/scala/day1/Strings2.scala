package day1

object Strings2 extends App {
  def stringMaker(string1: String, string2: String, find:Char, replace: Char): String =
    (string1 + string2).map(x => if (x.equals(find)) replace else x)
  println(stringMaker("ha", "llo", 'a', 'e'))
}


