import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.abs;

/**
 */
public class GameOfLife {



    public static Collection<LiveCell> allNeighboursAround(int x, int y, Collection<LiveCell> liveCells) {
        Set<LiveCell> neigbours = new HashSet<LiveCell>();
        for (LiveCell cell : liveCells) {

            if (abs(cell.getX() - x) == 1 || abs(cell.getY() - y) == 1)  {
                neigbours.add(cell);
            }
        }
        return neigbours;
    }

    public static boolean willBeAlive(int numberOfAliveNeighbourCells){
        return !willBeDead(numberOfAliveNeighbourCells);
    }

    public static boolean willBeDead(int numberOfAliveNeighbourCells) {
        return numberOfAliveNeighbourCells < 2 || numberOfAliveNeighbourCells > 3;
    }

    public GameOfLife addLivingCellAt(int x, int y) {

        return this;
    }

    public Collection<LiveCell> getLivingCells() {
        return Collections.emptySet();
    }

    public static Collection<LiveCell> nextGenerationOf(Collection<LiveCell> board) {
        Collection nextGeneration = new HashSet<LiveCell>();

        for(LiveCell cell : board) {
               if()
        }

    }
}
