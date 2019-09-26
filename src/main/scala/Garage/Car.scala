package Garage

class Car (carModel:String, carReg:String, carYear:Int) extends Vehicle {
  val model=carModel.toUpperCase
  val reg=carReg.toUpperCase
  val year=carYear
  def brokenParts=(1 + scala.util.Random.nextInt(11))
  override def toString: String = s"(Model:$carModel, Reg:$carReg, Year:$carYear, BrokenParts:$brokenParts)"
}