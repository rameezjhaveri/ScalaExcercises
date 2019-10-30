package Garage

class Bike (bikeModel:String, bikeReg:String, bikeYear:Int) extends Vehicle {
  val model=bikeModel.toUpperCase
  val reg=bikeReg.toUpperCase
  val year=bikeYear
  lazy val brokenParts=(scala.util.Random.nextInt(10))
  var timeToFix: Int = _
  var costToFix: Int = _
  override def toString: String = s"(Model:$model, Reg:$reg, Year:$year, BrokenParts:'$brokenParts', timeToFix: '$timeToFix', costToFix: '$costToFix')"
}