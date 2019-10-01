package Garage

import org.mongodb.scala._
object DBConnection extends App {
  val mongoClient: MongoClient = MongoClient("mongodb://localhost")

  def getConnection():Unit = {
    val database: MongoDatabase = mongoClient.getDatabase("garage")
    val carCollection = database.getCollection("car")
  }

  def closeConnection(): Unit ={
    mongoClient.close()
  }
}
