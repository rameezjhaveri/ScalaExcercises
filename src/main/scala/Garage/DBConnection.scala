package Garage

import org.mongodb.scala._
object DBConnection extends App {

  def getClient(address:String):MongoClient= {
    val mongoClient: MongoClient = MongoClient(address)
    mongoClient
  }
  def getConnectionDatabase(mongoClient:MongoClient, database:String):MongoDatabase = {
    val myDatabase: MongoDatabase = mongoClient.getDatabase(database)
    myDatabase
  }

  def getConnectionCollection(database: MongoDatabase, collection:String):Any ={
    val myCollection = database.getCollection(collection)
    myCollection
  }

  def closeConnection(mongoClient:MongoClient): Unit ={
    mongoClient.close()
  }

}