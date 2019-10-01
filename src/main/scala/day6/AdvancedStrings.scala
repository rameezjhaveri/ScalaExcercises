package day6

object AdvancedStrings extends App {
  def sequenceFinder(input1:String,input2:String):String={
    val smallerWord =(input1, input2) match {
      case _ if(input1.length < input2.length) => input1
      case _ if(input2.length < input1.length) => input2
      case _ if(input1.length == input2.length) => input1
    }

    val longerWord = (input1,input2) match {
      case _ if (input1 == smallerWord) => input2
      case _ => input1
    }
  "test11"
  }

  val list1 = List("A","B","C","D","E")
  val list2 = List(4,2,3,1)

  println(list1.dropRight(1))

  if (list1 == list2) println("match")
  else println("no match")

  println(sequenceFinder("cde", "abcdefg"))
}
