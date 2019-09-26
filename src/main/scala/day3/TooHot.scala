package day3

object TooHot extends App {
def tooHot(temp:Int,isSummer:Boolean):Any= (temp, isSummer) match{
  case _ if (isSummer==true && 60<=temp && 100>=temp) => true
  case _ if (isSummer==false && 60<=temp && 90>=temp) => true
  case _ if (isSummer==true && 100<=temp || 60>=temp) => false
  case _ if (isSummer==false && 90<=temp || 60>=temp) => false
}

  println(tooHot(80,false))
  println(tooHot(100,false))
  println(tooHot(100,true))
}
