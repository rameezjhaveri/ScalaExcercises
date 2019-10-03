package Garage

import resources.BaseTestingClass
import org.mongodb.scala._
import org.mockito.Mockito._

class GarageTest extends BaseTestingClass{

  test("openConnection should return an instance of MongoCollection[Document]"){
    val testGarage = mock[Garage]
    val collection = mock[MongoCollection[Document]]
    val garage = new Garage
    when(testGarage.openConnection("vehicles")).thenReturn(collection)
    assert(garage.openConnection("vehicles").isInstanceOf[MongoCollection[Document]])
  }

}


