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

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void addCard(Card newCard) {
        this.cards.add(newCard);
    }

    public int cardCount() {
        return this.cards.size();
    }

    public int handTotal(Player player) {
        ArrayList<Card> playerCards = player.getCards();
        int total = 0;
        for(Card card : playerCards){
            total += card.getValueFromEnum();
        }
        return total;
    }
}
