package day4

object Lumberjack extends App {
  def logPlacement(gridSize:Int,numbOfLogs:Int,grid:List[Int]):List[Int]={
    var logsLeft = numbOfLogs
    var minValue = grid.reduceLeft(_ min _)

    var newGrid:List[Int] = grid.map{
      case (number) =>
        if (number == minValue && logsLeft>0) {
          number + 1
          logsLeft - 1
        }
        else number
        }
    println("logsLeft: "+logsLeft)
    println("minValue: "+minValue)
    println("grid: " + newGrid)
    if (logsLeft > 0) logPlacement(gridSize, logsLeft, newGrid)
          else grid
  }


  logPlacement(3,7,List(1,1,1,2,1,3,1,4,1))
}
