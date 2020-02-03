import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public int getSize() {
        return this.deck.size();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card newCard = new Card(suit, rank);
                this.deck.add(newCard);
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(this.deck);
    }

    public Card getFirstCard() {
        return this.deck.get(0);
    }

    public void removeCardFromDeck(Card oldCard) {
        this.deck.remove(oldCard);
    }

    public Card dealCard() {
        Card dealCard = getFirstCard();
        removeCardFromDeck(dealCard);
        return dealCard;
    }

    public String higherCard(ArrayList<String> players, ArrayList<Card> cards) {
        String player1Name = players.get(0);
        String player2Name = players.get(1);

        int player1Value = cards.get(0).getValueFromEnum();
        int player2Value = cards.get(1).getValueFromEnum();

        if (player1Value > player2Value) {
            return player1Name + " wins";
        } else {
            return player2Name + " wins";
        }
    }
}