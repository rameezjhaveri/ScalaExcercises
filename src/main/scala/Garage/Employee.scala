package Garage

class Employee(fullName:String, employeeID:String) extends Person {
  def this(fullName:String) = this(fullName, (s"E${(fullName.toUpperCase.substring(0,3))+
    scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)}"))
  val name: String = fullName
  override def toString: String = s"(Name:$fullName, ID:$employeeID)"
}

//IMPLEMENT BETTER ID GENERATING SYSTEM
//USE STATIC CLASS WITH METHOD AND AUTO INCREMENT