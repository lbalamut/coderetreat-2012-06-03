import org.scalatest.FunSuite

class GameOfLifeSuite extends FunSuite {

  test("we can add cell to the board") {

    assert(!Board().addCell(0,0).isEmpty)
  }

  test("cells with less than 2 neighbours dies") {

    val boardWithOneCell = Board().addCell(0, 0)

    val nextGeneration = boardWithOneCell.nextGeneration()

    assert(nextGeneration.isEmpty)
  }

}