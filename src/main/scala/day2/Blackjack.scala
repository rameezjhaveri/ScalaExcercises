package day2

object Blackjack extends App{
  def winningHand(hand1: Int, hand2: Int): Any = {
    val hand1Bust=hand1>21
    val hand2Bust=hand2>21
    (hand1, hand2) match {
      case _ if hand1Bust && hand2Bust => 0
      case _ if hand1Bust => hand2
      case _ if hand2Bust => hand1
      case _ if hand1>hand2 => hand1
      case _ if hand2>hand1 => hand2
      case _ => "DRAW":String
    }
  }
  println(winningHand(7, 7))
}
