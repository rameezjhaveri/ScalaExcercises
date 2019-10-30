package day1

object Strings extends App {
def stringCutter(word:String,cut:Int):String= word.drop(cut)
  println(stringCutter("Hello", 2))
}
