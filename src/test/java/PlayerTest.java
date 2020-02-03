import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Card card1;
    Card card2;
    Player player;

    @Before
    public void Setup(){
        card1 = new Card(SuitType.CLUBS, RankType.EIGHT);
        card2 = new Card(SuitType.HEARTS, RankType.JACK);
        player = new Player("Player1");
    }

    @Test
    public void hasName(){
        assertEquals("Player1", player.getName());
    }

    @Test
    public void canAddCards(){

    }

}
