package day4

object MorseCode extends App {

  val morseCode = List(".-", "-...", "-.-.")
  val morseCodeList = morseCode.zipWithIndex.map{
    case (morse, index) =>
      (index + 61).toHexString
  }
}
