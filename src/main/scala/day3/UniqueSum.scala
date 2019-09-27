package day3

object UniqueSum extends App {

  def uniqueSum(input1:Int,input2:Int,input3:Int):Int= {
    val input1And2Match: Boolean = input1 == input2
    val input2And3Match: Boolean = input2 == input3
    val input1And3Match: Boolean = input1 == input3

    (input1And2Match,input2And3Match,input1And3Match) match {
      case _ if input1And2Match && input2And3Match => 0
      case _ if input1And2Match => input3
      case _ if input2And3Match => input1
      case _ if input1And3Match => input2
      case _ => input1 + input2 + input3
    }
  }

  println(uniqueSum(1,2,3))
  println(uniqueSum(3,3,3))
  println(uniqueSum(1,1,2))
  }
