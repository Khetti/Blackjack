import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Player player;

    @Before
    public void setUp(){
        deck = new Deck();
        player = new Player("Player1");
    }

    @Test
    public void hasName(){
        assertEquals("Player1", player.getName());
    }

    @Test
    public void canAddCards(){
        Card card1 = deck.dealCard();
        Card card2 = deck.dealCard();
        player.addCard(card1);
        player.addCard(card2);
        assertEquals(2, player.cardCount());
    }

}
