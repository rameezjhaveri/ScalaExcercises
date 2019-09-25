package day1

object TypeInference extends App {
  def returnAll(input:Any)=input
  println(returnAll("Testing"))
  println(returnAll(5443))
  println(returnAll(341.532))
  println(returnAll(true))
}
