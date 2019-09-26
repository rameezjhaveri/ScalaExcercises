package Garage

class Bike (bikeModel:String, bikeReg:String, bikeYear:Int) extends Vehicle {
  val model=bikeModel.toUpperCase
  val reg=bikeReg.toUpperCase
  val year=bikeYear
  def brokenParts=(1 + scala.util.Random.nextInt(11))
  override def toString: String = s"(Car: $bikeModel, $bikeReg, $bikeYear, BrokenParts:$brokenParts)"
}