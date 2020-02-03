import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsOffEmpty() {
        assertEquals(0, deck.getSize());
    }

    @Test
    public void canPopulateCard() {
        deck.populateDeck();
        assertEquals(52, deck.getSize());
    }
}