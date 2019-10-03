package Garage

abstract class Vehicle(){
  def model: String
  def reg: String
  def year: Int
  def brokenParts: Int
  var timeToFix:Int
  var costToFix:Int
}