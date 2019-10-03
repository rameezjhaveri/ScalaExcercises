package Garage

class Car (carModel:String, carReg:String, carYear:Int) extends Vehicle {
  val model=carModel.toUpperCase
  val reg=carReg.toUpperCase
  val year=carYear
  lazy val brokenParts=(scala.util.Random.nextInt(10))
  var timeToFix: Int = _
  var costToFix: Int = _
  override def toString: String = s"{model:'$model', Reg:'$carReg', Year:$year, BrokenParts:'$brokenParts', timeToFix: '$timeToFix', costToFix: '$costToFix'}"
}