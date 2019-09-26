package Garage


class Customer(fullName:String, customerID:String) extends Person {
  def this(fullName: String) = this(fullName, (s"C${(fullName.toUpperCase.substring(0, 3))+
    scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)}"))
  val name: String = fullName
  override def toString: String = s"(Customer -  Name:$fullName, ID:$customerID)"
}