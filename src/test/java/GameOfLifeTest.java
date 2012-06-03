import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameOfLifeTest {

    @Test
    public void newGameIsEmpty() throws Exception {
        GameOfLife game = new GameOfLife();

        assertTrue(game.isEmpty());
    }

    @Test
    public void worldIsNotEmptyWhenYouAddCell() throws Exception {

        //given
        GameOfLife game = new GameOfLife();
        //when
        game.addCell(1,1);
        //then
        assertEquals(false, game.isEmpty());
    }

}
