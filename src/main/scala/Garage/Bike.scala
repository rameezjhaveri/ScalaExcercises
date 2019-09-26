package Garage

class Bike (bikeModel:String, bikeReg:String, bikeYear:Int) extends Vehicle {
  val model=bikeModel.toUpperCase
  val reg=bikeReg.toUpperCase
  val year=bikeYear
  var timeToFix: Int = _
  def brokenParts=(1 + scala.util.Random.nextInt(10))

  override def toString: String = s"(Model:$bikeModel, Reg:$bikeReg, Year:$bikeYear)"
}