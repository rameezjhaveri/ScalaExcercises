package Garage

object Stage1 extends App {

  abstract case class person(){
  def name:String
}
  class employee(fullName:String, employeeID:String) extends person {
    def this(fullName:String) = this(fullName, (s"E${(fullName.substring(0,2))+
      scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)}"))
    val name: String = fullName
    override def toString: String = s"(Employee: $fullName, $employeeID)"
  }
  class customer(fullName:String, customerID:String) extends person {
    def this(fullName: String) = this(fullName, (s"C${(fullName.substring(0, 2))+
      scala.util.Random.nextInt(10)+scala.util.Random.nextInt(10)}"))
    val name: String = fullName
    override def toString: String = s"(Employee: $fullName, $customerID)"
  }

  abstract case class vehicle() {
    def model: String
    def reg: String
    def year: Int
  }
  class car (carModel:String, carReg:String, carYear:Int) extends vehicle {
    val model=carModel
    val reg=carReg
    val year=carYear
    override def toString: String = s"(Car: $carModel, $carReg, $carYear)"
  }
  class bike (bikeModel:String, bikeReg:String, bikeYear:Int) extends vehicle {
    val model=bikeModel
    val reg=bikeReg
    val year=bikeYear
    override def toString: String = s"(Car: $bikeModel, $bikeReg, $bikeYear)"
  }
}
