package Garage

class Car (carModel:String, carReg:String, carYear:Int) extends Vehicle {
  val model=carModel.toUpperCase
  val reg=carReg.toUpperCase
  val year=carYear
  var timeToFix: Int = _
  def brokenParts=(1 + scala.util.Random.nextInt(10))
  override def toString: String = s"(Model:$model Reg:$carReg, Year:$year)"
}


