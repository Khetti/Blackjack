import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Player player;
    Card card1;
    Card card2;

    @Before
    public void setUp(){
        deck = new Deck();
        player = new Player("Player1");
        card1 = new Card(SuitType.HEARTS, RankType.QUEEN);
        card2 = new Card(SuitType.CLUBS, RankType.QUEEN);
    }

    @Test
    public void hasName(){
        assertEquals("Player1", player.getName());
    }

    @Test
    public void canAddCards() {
        Card card1 = deck.dealCard();
        Card card2 = deck.dealCard();
        player.addCard(card1);
        player.addCard(card2);
        assertEquals(2, player.cardCount());
    }

    @Test
    public void canGetHandTotal() {
        player.addCard(card1);
        player.addCard(card2);
        assertEquals(20, player.handTotal(player));
    }

}
