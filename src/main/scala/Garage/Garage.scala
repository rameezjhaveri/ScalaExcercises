package Garage
import Garage.DBConnection._
import Garage.DBMethods._
import org.mongodb.scala._
import scala.collection.mutable.ListBuffer
import org.bson.BsonDocument





class Garage() {
  var isOpen = true
  var vehicleList = new ListBuffer[Vehicle]()
  var registeredEmployeesList = new ListBuffer[Person]()

  def viewGarageContents = {
    println("Vehicles in garage: " + vehicleList)
    println("Employees in garage: " + registeredEmployeesList)
  }

  def openGarage():Unit ={
    isOpen = true
  }

  def closeGarage():Unit ={
    isOpen = false
  }

  def addVehicle(vehicle:Vehicle):Unit={
//    vehicleList.addOne(vehicle)
    val carDoc:Document = Document(BsonDocument.parse(vehicle.toString))
    val client = getClient("mongodb://localhost")
    val db = getConnectionDatabase(client,"garage")
    val collection = getConnectionCollection(db, "car")

    addDocument(carDoc,collection)
    closeConnection(client)
  }

  def registerEmployee(employee: Employee):Unit={
    registeredEmployeesList.addOne(employee)
  }

  def fixingVehicleTime(vehicle: Vehicle):Int={
    val repairTime = List.fill(vehicle.brokenParts)(1).map(part =>
      part * (1 + scala.util.Random.nextInt(6))).foldLeft(0)(_ + _)
    repairTime
  }

  def calculateBill(vehicle: Vehicle):Int={
  val fixingTime = fixingVehicleTime(vehicle)
  val hourlyRate = 11
  val partCosts = vehicle.brokenParts*(20+scala.util.Random.nextInt(70))
  val labourCost = (fixingTime * hourlyRate)
  val totalCost = partCosts + labourCost
  println(vehicle)
  println(s"Labour: £$labourCost")
  println(s"Parts: £$partCosts")
  println(s"Total Cost: £$totalCost")
  println(s"Repair Time  $fixingTime hrs")
  totalCost
  }

  def removeVehicleById(Id:String):Any={
    val ID =Id.toUpperCase
    vehicleList = vehicleList.filterNot(vehicle=>vehicle.reg == ID)
//    println(vehicleList)
  }
  def removeVehicleByModel(carModel:String):Any={
    val model = carModel.toUpperCase
    vehicleList = vehicleList.filterNot(vehicle=>vehicle.model == model)
//    println(vehicleList)
  }
}