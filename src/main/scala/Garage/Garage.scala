package Garage
import Garage.DBConnection._
import com.mongodb.DBObject
import org.mongodb.scala.bson.collection.immutable.Document
import spray.json._
import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.collection.mutable.ListBuffer

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
    vehicleList.addOne(vehicle)
    val carDoc = Document.

      vehicle.toString.parseJson
    val doc: Document = Document(
      "_id" -> 1,
      "name" -> "MongoDB",
      "type" -> "database",
      "count" -> 1,
      "info" -> Document(
        "x" -> 203,
        "y" -> 102)
    )

    val client = getClient("mongodb://localhost")
    val db = getConnectionDatabase(client,"garage")
    val collection = getConnectionCollection(db, "car")

    def addDocument(doc: Document) = {
      collection.insertOne(doc)
        .subscribe(new Observer[Completed] {
          override def onNext(result: Completed): Unit = println("Inserted")
          override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
          override def onComplete(): Unit = println("Completed")
        })
    }

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