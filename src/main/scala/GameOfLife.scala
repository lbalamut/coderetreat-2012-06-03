
object GameOfLife {
  def apply(cells: Pair[Int, Int]*): GameOfLife = GameOfLife(cells.toSet)
}

case class GameOfLife(cells: Set[Pair[Int, Int]] = Set()) {

  def setAlive(x: Int, y: Int) = GameOfLife(cells + Pair(x,y))

  def isAlive(x: Int, y: Int): Boolean = cells.contains(Pair(x,y))

  def nextGeneration() = GameOfLife(cells.filter(survivesToNextGeneration))

  def survivesToNextGeneration(cell: (Int, Int)):  Boolean = {
    var count = 0

    for (x <- cell._1 - 1 to cell._1 + 1;
        y <- (cell._2 - 1 to cell._2 + 1)
        if (isAlive(x,y))) {

      count += 1

    }
    count == 3 | count == 4
  }
}