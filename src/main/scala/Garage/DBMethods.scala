package Garage

import org.mongodb.scala._

object DBMethods extends App {

  def addDocument(doc:Document, collection: MongoCollection[Document]) = {
    collection.insertOne(doc)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Completed")
      })
    Thread.sleep(100)
  }

}
