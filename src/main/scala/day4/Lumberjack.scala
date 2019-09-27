package day4

object Lumberjack extends App {
  def logPlacement(gridSize:Int,numbOfLogs:Int,grid:List[Int]):List[Int]={
    var logsLeft = numbOfLogs
    var minValue = grid.reduceLeft(_ min _)

    var newGrid:List[Int] = grid.map{
      case (number) =>
        if (number == minValue && logsLeft>0) {
          logsLeft -= 1
          number + 1
        }
        else number
        }
    println(newGrid)
    if (logsLeft > 0) logPlacement(gridSize, logsLeft, newGrid)
          else grid
  }
  logPlacement(3,50,List(1,1,0,2,1,3,0,4,1))
}
