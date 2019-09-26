package Garage

object Main extends App {

  println(new Employee("rameez", "ERAM001"))
  println(new Customer("rameez"))

  val myCar1 = new Car("Audi", "FG60DKE", 2019)
  val myCar2 = new Car("Audi", "FG60DKE", 2018)
  val myCar3 = new Car("Audi", "FG60DKE", 2017)
  val garage = new Garage
  garage.addVehicle(myCar1)
  garage.addVehicle(myCar2)
  garage.addVehicle(myCar3)
  garage.removeVehicleById("FG60DKE")
  println(garage.vehicleList)
  println(garage.isOpen)
  garage.closeGarage()
  println(garage.isOpen)
  garage.openGarage()
  println(garage.isOpen)
}
