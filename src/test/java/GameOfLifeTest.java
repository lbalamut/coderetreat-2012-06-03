import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 */
public class GameOfLifeTest {
    @Test
    public void noNeighbours() throws Exception {
        Collection<LiveCell> liveCells = Collections.emptySet();
        Collection<LiveCell> neigbours = GameOfLife.allNeighboursAround(0, 0, liveCells);

        assertTrue(neigbours.isEmpty());
    }

    @Test
    public void oneNeighborToTheLeft() throws Exception {
        Collection<LiveCell> board = Arrays.asList(new LiveCell(0,1));
        Collection<LiveCell> neigbours = GameOfLife.allNeighboursAround(0, 2, board);

        assertEquals(1, neigbours.size());
    }

    @Test
    public void oneNeighborDownAndInCenter() throws Exception {
        Collection<LiveCell> liveCells = Arrays.asList(new LiveCell(2,2));
        Collection<LiveCell> neigbours = GameOfLife.allNeighboursAround(1, 2, liveCells);

        assertEquals(1, neigbours.size());
    }

    @Test
    public void shouldNotConsiderCenterAsNeighbour() throws Exception {
        Collection<LiveCell> liveCells = Arrays.asList(new LiveCell(1,2));
        Collection<LiveCell> neigbours = GameOfLife.allNeighboursAround(1, 2, liveCells);

        assertEquals(0, neigbours.size());
    }

    @Test
    public void shouldBeDeadInNextGeneration_WithLessThanTwoNeighbours() {
        int numberOfAliveCells = 1;
        assertFalse(GameOfLife.willBeAlive(numberOfAliveCells));
    }

    @Test
    public void shouldBeAliveInNextGeneration_WithTwoNeighbours() {
        int numberOfAliveCells = 2;
        assertTrue(GameOfLife.willBeAlive(numberOfAliveCells));
    }

    @Test
    public void testThatNextGenerationKillsSingleCell() {
        Collection<LiveCell> board = Arrays.asList(new LiveCell(0, 0));
        Collection<LiveCell> nextGenBoard = GameOfLife.nextGenerationOf(board);
        Assert.assertEquals(0, nextGenBoard.size());
    }

//    @Test
//    public void testThatGameOfLiveCanHaveLivingCells() {
//        GameOfLife gol = new GameOfLife();
//        gol = gol.addLivingCellAt(0, 0);
//        Assert.assertEquals(1, gol.getLivingCells().size());
//    }
}
