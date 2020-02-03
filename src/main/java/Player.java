import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name){
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
}
