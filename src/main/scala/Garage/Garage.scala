package Garage

import Garage.DBConnection._
import Garage.DBMethods._
import org.mongodb.scala._
import org.bson.BsonDocument

class Garage() {

  def openConnection(collectionName:String):MongoCollection[Document] = {
    val client = getClient("mongodb://localhost")
    val db = getConnectionDatabase(client,"garage")
    val collection = getConnectionCollection(db, collectionName)
      collection
  }

  def closeConnection():Unit = {
    val client = getClient("mongodb://localhost")
    closingConnection(client)
  }

  def viewGarageContents():Unit = {
    getAllGarage(openConnection("car"))
    getAllGarage(openConnection("employees"))
    closeConnection()
  }

  def openGarage():Unit ={
  }

  def closeGarage():Unit ={
  }

  def addVehicle(vehicle:Vehicle):Unit={
    fixingVehicleTime(vehicle:Vehicle)
    calculateBill(vehicle:Vehicle)
    val carDoc:Document = Document(BsonDocument.parse(vehicle.toString))
    addDocument(carDoc,openConnection("car"))
    closeConnection()
  }

  def registerEmployee(employee: Employee):Unit={
    val employeeDoc:Document = Document(BsonDocument.parse((employee.toString)))
    addDocument(employeeDoc,openConnection("employees"))
    closeConnection()
  }

  def fixingVehicleTime(vehicle: Vehicle):Unit={
    val repairTime = List.fill(vehicle.brokenParts)(1).map(part =>
      part * (1 + scala.util.Random.nextInt(6))).sum
    vehicle.timeToFix=repairTime
  }

  def calculateBill(vehicle: Vehicle):Unit={
  val fixingTime = vehicle.timeToFix
  val hourlyRate = 11
  val partCosts = vehicle.brokenParts*(20+scala.util.Random.nextInt(70))
  val labourCost = (fixingTime * hourlyRate)
  val totalCost = partCosts + labourCost
    vehicle.costToFix=totalCost
  }

  def findVehicleById(regNo: String): Unit = {
    findById(regNo,openConnection("car"))
    closeConnection()
  }

  def findVehicleByModel(model: String): Unit = {
    findByModel(model,openConnection("car"))
    closeConnection()
  }

  def removeVehicleById(id:String):Any={
    deleteById(id,openConnection("car"))
    closeConnection()
  }

  def removeVehicleByModel(carModel:String):Any={
    deleteByModel(carModel,openConnection("car"))
    closeConnection()
  }

}