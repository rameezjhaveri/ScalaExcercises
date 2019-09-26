package day3.Garage

import day3.Garage.Stage1.{Person, Vehicle, Car, Bike, Employee}

import scala.collection.mutable.ListBuffer


object Stage2 extends App {
  class Garage() {
    var vehicleList = new ListBuffer[Vehicle]()
    var peopleInside = new ListBuffer[Person]()

    def addVehicle(aVehicle:Vehicle):Unit={
      vehicleList.addOne(aVehicle)
    }

  }
//  val myCar1 = new Car("Audi", "FG60DKE", 2019)
//  val myCar2 = new Car("Audi", "FG60DKE", 2018)
//  val myCar3 = new Car("Audi", "FG60DKE", 2017)
//  val garage = new Garage
//  garage.addVehicle(myCar1)
//  garage.addVehicle(myCar2)
//  garage.addVehicle(myCar3)
//  println(garage.vehicleList)
}
