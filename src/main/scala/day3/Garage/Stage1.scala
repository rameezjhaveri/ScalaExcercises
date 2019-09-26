package day3.Garage

object Stage1 extends App {

  abstract case class Person(){
  def name:String
}
  class Employee(fullName:String, employeeID:String) extends Person {
    def this(fullName:String) = this(fullName, (s"E${(fullName.toUpperCase.substring(0,3))+
      scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)}"))
    val name: String = fullName
    override def toString: String = s"(Employee -  Name:$fullName, ID:$employeeID)"
  }
  class Customer(fullName:String, customerID:String) extends Person {
    def this(fullName: String) = this(fullName, (s"C${(fullName.toUpperCase.substring(0, 3))+
      scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)}"))
    val name: String = fullName
    override def toString: String = s"(Customer -  Name:$fullName, ID:$customerID)"
  }

  abstract case class Vehicle() {
    def model: String
    def reg: String
    def year: Int
  }
  class Car (carModel:String, carReg:String, carYear:Int) extends Vehicle {
    val model=carModel
    val reg=carReg
    val year=carYear
    override def toString: String = s"(Car: $carModel, $carReg, $carYear)"
  }
  class Bike (bikeModel:String, bikeReg:String, bikeYear:Int) extends Vehicle {
    val model=bikeModel
    val reg=bikeReg
    val year=bikeYear
    override def toString: String = s"(Car: $bikeModel, $bikeReg, $bikeYear)"
  }
  println(new Employee("rameez", "ERAM001"))
  println(new Customer("rameez"))


}
