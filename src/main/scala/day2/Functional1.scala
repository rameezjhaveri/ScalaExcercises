package day2

object Functional1 extends App {
  val timezoneSplitter = java.util.TimeZone.getAvailableIDs
    .map(x=>x.split('/'))
    .filter(x=> x.length>1)
    .grouped(10)
    timezoneSplitter.foreach(x=> (x.foreach(x=> x.foreach(x=>println(x)))))
}