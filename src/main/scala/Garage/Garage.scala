package Garage

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
  }
  def registerEmployee(employee: Employee):Unit={
    registeredEmployeesList.addOne(employee)
  }
  def fixingVehicle(partsToRepair:Int):Int={
    val partsToRepairTime = List.fill(partsToRepair)(1).map(part => part * (1 + scala.util.Random.nextInt(6))).
      foldLeft(0)(_ + _)
//    println("Repair Time " + partsToRepairTime +"hrs")

    partsToRepairTime
  }
  def calculateBill(partsToRepair:Int):Int={
    val fixingTime = fixingVehicle(partsToRepair)
    val hourlyRate = 11
    val partCosts = partsToRepair*(20+scala.util.Random.nextInt(70))
    val labourCost = (fixingTime * hourlyRate)
    val totalCost = partCosts + labourCost
//    println("Labour: £" + labourCost)
//    println("Parts: £" + partCosts)
//    println("Total Cost: £" + totalCost)
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