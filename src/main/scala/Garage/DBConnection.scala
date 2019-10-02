package Garage


import org.mongodb.scala._
object DBConnection extends App {

  def getClient(address:String):MongoClient= {
    MongoClient(address)
  }
  def getConnectionDatabase(mongoClient:MongoClient, database:String):MongoDatabase = {
    mongoClient.getDatabase(database)
    }

  def getConnectionCollection(database: MongoDatabase, collection:String):MongoCollection[Document] ={
    database.getCollection(collection)
  }

  def closingConnection(mongoClient:MongoClient): Unit ={
    mongoClient.close()
  }
}