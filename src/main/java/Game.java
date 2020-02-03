import java.util.ArrayList;

public class Game {

    private Player dealer;
    private Deck deck;
    private ArrayList<Player> players;

    public Game(){
        this.dealer = new Player("Dealer");
        this.deck = new Deck();
        this.players = new ArrayList<>();
    }

    public Deck getDeck() {
        return this.deck;
    }

    public String getDealerName() {
        return this.dealer.getName();
    }

    public Player getDealer() {
        return this.dealer;
    }

    public void addDealerCard() {
        Card newCard = this.deck.dealCard();
        this.dealer.addCard(newCard);
    }


    public void addPlayer() {
        Player newPlayer = new Player("Jeff");
        this.players.add(newPlayer);
    }

    public int playerCount() {
        return this.players.size();
    }
}
