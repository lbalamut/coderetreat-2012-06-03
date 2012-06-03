//import collection.mutable.{HashSet, Set}

case class Board(cells: Set[Pair[Int, Int]] = Set[Pair[Int, Int]]()) {

  def isEmpty = cells.isEmpty

  def addCell(x: Int, y: Int): Board = Board(cells + Pair(x, y))

  def nextGeneration() = Board(cells.filter(cellSurvivesForNextGeneration))

  def cellSurvivesForNextGeneration(cell: (Int, Int)): Boolean = {
    false
  }
}