package Garage

class Car (carModel:String, carReg:String, carYear:Int) extends Vehicle {
  val model=carModel.toUpperCase
  val reg=carReg.toUpperCase
  val year=carYear
  var timeToFix: Any = "Not Yet Assessed"
  def brokenParts=(1 + scala.util.Random.nextInt(10))
  override def toString: String = s"{model:'$model', Reg:'$carReg', Year:$year, BrokenParts:'$brokenParts', timeToFix: '$timeToFix'}"
}