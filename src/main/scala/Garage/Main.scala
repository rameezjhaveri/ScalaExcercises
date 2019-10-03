package Garage

object Main extends App {
  val garage = new Garage

//  val employee1 = new Employee("Rameez", "ERAM001")
//  val employee2 = new Employee("Batman")
//  garage.registerEmployee(employee1)
//  garage.registerEmployee(employee2)
//
//  val car1 = new Car("AUDI", "AA70AAA", 2019)
//  val car2 = new Car("BMW", "AA70AAB", 2018)
//  val car3 = new Car("VW", "AA70AAC", 2014)
//  val car4 = new Car("AUDI", "AA70AAD", 2018)
//  val car5 = new Car("TOYOTA", "AA70AAE", 2010)
//  val car6 = new Car("BMW", "AA70AAF", 2016)
//  val car7 = new Car("BMW", "AA70AAG", 2016)
//  val car8 = new Car("VW", "AA70AAH", 2015)
//  val car9 = new Car("AUDI", "AA70AAI", 2018)
//  val car10 = new Car("SEAT", "AA70AAJ", 2013)
//  val car11 = new Car("TESLA", "AA70AAK", 2015)
//  val car12 = new Car("RENAULT", "AA70AAL", 2011)
//
//  garage.addVehicle(car1)
//  garage.addVehicle(car2)
//  garage.addVehicle(car3)
//  garage.addVehicle(car4)
//  garage.addVehicle(car5)
//  garage.addVehicle(car6)
//  garage.addVehicle(car7)
//  garage.addVehicle(car8)
//  garage.addVehicle(car9)
//  garage.addVehicle(car10)
//  garage.addVehicle(car11)
//  garage.addVehicle(car12)

//  garage.findVehicleByModel("VW")
//  garage.removeVehicleById("AA70AAD")
  garage.fixVehicleByReg("AA70AAA")
  garage.viewGarageContents()

//  garage.calculateBill(car1)

}