import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 */
public class GameOfLifeTest {

    @Test
    public void newGameIsEmpty() throws Exception {
        GameOfLife game = new GameOfLife();

        assertTrue(game.isEmpty());
    }

}
