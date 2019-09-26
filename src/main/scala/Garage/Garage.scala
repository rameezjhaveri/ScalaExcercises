package Garage

import scala.collection.mutable.ListBuffer

class Garage() {
  var isOpen = true
  var vehicleList = new ListBuffer[Vehicle]()
  var registeredEmployees = new ListBuffer[Person]()

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
    registeredEmployees.addOne(employee)
  }

//  METHODS NOT FUNCTIONAL YET
//  def removeVehicleById(Id:String):Any={
//    val ID =Id.toUpperCase
//  }
//  def removeVehicleByModel(carModel:String):Any={
//    val model = carModel.toUpperCase
//  }



}