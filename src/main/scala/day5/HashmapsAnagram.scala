package day5
import scala.io.Source

object HashmapsAnagram extends App {
  def linesToArray(absolutePath:String):Array[String] = Source.fromFile(absolutePath)
    .getLines.toArray

  linesToArray("C:\\Users\\Admin\\Desktop\\text.txt")
    .foreach(line => println(line))
}
