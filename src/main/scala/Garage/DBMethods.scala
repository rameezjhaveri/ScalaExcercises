package Garage

import scala.concurrent.ExecutionContext.Implicits.global
import org.mongodb.scala.{Document, _}
import org.mongodb.scala.model._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._
import scala.util.{Failure, Success}


object DBMethods extends App {

  def addDocument(doc:Document, collection: MongoCollection[Document]):Unit = {
    collection.insertOne(doc)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Completed")
      })
    Thread.sleep(100)
  }

  def findByModel(vehicleModel: String, collection: MongoCollection[Document]):Unit = {
    collection.find(equal("model", vehicleModel)).headOption().onComplete{
      case Success(value) => println(s"Found Vehicle: ${value.getOrElse("none found")}")
      case Failure(error) => error.printStackTrace()
    }
    Thread.sleep(100)
  }

  def deleteByModel(vehicleModel:String, collection: MongoCollection[Document]):Unit = {
    collection.deleteOne(equal("model", vehicleModel)).head().onComplete{
      case Success(value) => println(s"Vehicle deleted $value")
      case Failure(error) => error.printStackTrace()
    }
    Thread.sleep(100)
  }

  def findById(vehicleId:String, collection: MongoCollection[Document]):Unit = {
    collection.find(equal("Reg", vehicleId)).headOption().onComplete{
      case Success(value) => println(s"Found Vehicle: ${value.getOrElse("")}")
      case Failure(error) => error.printStackTrace()
    }
    Thread.sleep(100)
  }

  def deleteById(vehicleId:String, collection: MongoCollection[Document]):Unit = {
    collection.deleteOne(equal("Reg", vehicleId)).headOption().onComplete{
      case Success(value) => println("Vehicle Deleted")
      case Failure(error) => error.printStackTrace()
    }
    Thread.sleep(100)
  }

  def getAllGarage(collection: MongoCollection[Document]):Unit={
    collection.find().foreach(println)
    Thread.sleep(1000)
  }

  def updateField(regNo:String,collection: MongoCollection[Document]):Unit = {
    collection.updateOne(equal("Reg",regNo),set("BrokenParts",0)).headOption().onComplete{
      case Success(value) => println()
      case Failure(error) => error.printStackTrace()
    }
    collection.updateOne(equal("Reg",regNo),set("timeToFix",0)).headOption().onComplete{
      case Success(value) =>
      case Failure(error) => error.printStackTrace()
    }
    collection.updateOne(equal("Reg",regNo),set("costToFix",0)).headOption().onComplete{
      case Success(value) => println(s"The value has been updated to $value")
      case Failure(error) => error.printStackTrace()
    }

    Thread.sleep(1000)
  }

}