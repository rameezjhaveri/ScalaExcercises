package day4

object MorseCode extends App {
  val morseCodeMap: Map[String, String] = Map(
    ".-" -> "A",
    "-..." -> "B",
    "-.-." -> "C",
    "-.." -> "D",
    "." -> "E",
    "..-." -> "F",
    "--." -> "G",
    "...." -> "H",
    ".." -> "I",
    ".---" -> "J",
    "-.-" -> "K",
    ".-.." -> "L",
    "--" -> "M",
    "-." -> "N",
    "---" -> "O",
    ".--." -> "P",
    "--.-" -> "Q",
    ".-." -> "R",
    "..." -> "S",
    "-" -> "T",
    "..-" -> "U",
    "...-" -> "V",
    ".--" -> "W",
    "-..-" -> "X",
    "-.--" -> "Y",
    "--.." -> "Z")

  def morseToEnglish(morse:String):Unit={
    var english = ""
    val morseWords = morse.split(" /").toList.map{ morse =>english += morseCodeMap(morse)}
    println(english)
  }


  def englishToMorse(english:String):Unit= {
    var morse = ""
    val morseWords = english.split(" ").toList.map { morse =>
      //      morseCodeMap.find()
      //      morse += morseCodeMap(english)}
      morse
    }
  }

  morseToEnglish(".... /. /.-.. /.-.. /---")
}
