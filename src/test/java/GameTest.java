import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void hasDeck() {
        assertNotNull(game.getDeck());
    }

    @Test
    public void hasDealer() {
        assertEquals("Dealer", game.getDealerName());
    }

    @Test
    public void canAddDealerCard() {
        game.addDealerCard();
        Player dealer = game.getDealer();
        assertEquals(1, dealer.cardCount());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer();
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canCheckResult() {
        Player player1 = game.addPlayer();
        game.addDealerCard();
        game.addDealerCard();
        game.addPlayerCard(player1);
        game.addPlayerCard(player1);
        assertEquals("Dealer Wins!", game.checkResult(player1));
    }
}
