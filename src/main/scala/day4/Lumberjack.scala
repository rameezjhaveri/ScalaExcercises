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

    println("-----------")
    println(newGrid(0)+ " " + newGrid(1)+ " " +newGrid(2))
    println(newGrid(3)+ " " + newGrid(4)+ " " + newGrid(5))
    println(newGrid(6)+ " " + newGrid(7)+ " " + newGrid(8))
    println("-----------")


    if (logsLeft > 0) logPlacement(gridSize, logsLeft, newGrid)
          else grid
  }


  logPlacement(3,15,List(1,1,1,2,1,3,1,4,1))
}
