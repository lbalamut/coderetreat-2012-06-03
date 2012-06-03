import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 */

class GameOfLifeSuite extends FunSuite with ShouldMatchers{

  test ("Env should be able to tell state of cells") {
    val env = GameOfLife()
    env.isAlive(0, 0) should be (false)
  }

  test ("Env should be able to change state of cell") {
    var env = GameOfLife()
    env = env.setAlive(0, 0)
    env.isAlive(0, 0) should be (true)
  }

  test ("single cell dies")  {
    val envWithSingleCell = GameOfLife().setAlive(0, 0)
    envWithSingleCell.nextGeneration().isAlive(0, 0) should be (false)
  }

  test ("we should be able to create a env with multiple alive cells at once") {
    val env = GameOfLife((0,0), (0,1))
    env.isAlive(0,0) should be (true)
    env.isAlive(0,1) should be (true)
  }

  test ("Cell with two neighbours stayes alive") {
    val envWithThreeCells = GameOfLife((0,0), (0,1), (1,1))
    val nextGeneration = envWithThreeCells.nextGeneration()
    nextGeneration.isAlive(0,0) should be(true)
    nextGeneration.isAlive(0,1) should be(true)
    nextGeneration.isAlive(1,1) should be(true)
  }

  test ("Cell with three neighbours stayes alive") {
    val envWithThreeCells = GameOfLife((0,0), (0,1), (1,1), (0,-1))
    val nextGeneration = envWithThreeCells.nextGeneration()
    nextGeneration.isAlive(0,0) should be(true)
    nextGeneration.isAlive(0,1) should be(true)
    nextGeneration.isAlive(1,1) should be(true)
    nextGeneration.isAlive(0,-1) should be(true)
  }


}