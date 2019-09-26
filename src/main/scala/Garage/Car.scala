package Garage



class Car (carModel:String, carReg:String, carYear:Int) extends Vehicle {
  val model=carModel.toUpperCase
  val reg=carReg.toUpperCase
  val year=carYear
  override def toString: String = s"(Car: $carModel, $carReg, $carYear)"
}
