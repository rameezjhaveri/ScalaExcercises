package day2

object Functional1 extends App {
  val timezoneSplitter = java.util.TimeZone.getAvailableIDs
    .map(timezoneList=>timezoneList.split('/'))
    .filter(nestedLists=> nestedLists.length>1)
    .grouped(10)
    timezoneSplitter.foreach(groupedList=> groupedList.foreach(list=> list.foreach(element=>println(element))))
}