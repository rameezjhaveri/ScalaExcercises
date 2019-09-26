package Garage

object Main extends App {
  val garage = new Garage

    val employee1 = new Employee("Rameez", "ERAM001")
    val employee2 = new Employee("Batman")

    val myCar1 = new Car("Audi", "FG60DKA", 2019)
    val myCar2 = new Car("BMW", "FG60DKB", 2018)
    val myCar3 = new Car("VW", "FG60DKC", 2017)

  garage.addVehicle(myCar1)
  garage.addVehicle(myCar2)
  garage.addVehicle(myCar3)
  garage.registerEmployee(employee1)
  garage.registerEmployee(employee2)
  println(garage.vehicleList)

//garage.viewGarageContents
  //  println(garage.registeredEmployeesList)
//    garage.removeVehicleById("FG60DKB")
//  garage.removeVehicleByModel("AUDI")
//  println(garage.vehicleList)`
//  println(garage.isOpen)
//  garage.closeGarage()
//  println(garage.isOpen)
//  garage.openGarage()
//  println(garage.isOpen)
//garage.fixingVehicle(5)
//garage.calculateBill(5)

}
