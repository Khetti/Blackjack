import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        UI ui = new UI();
        ui.welcome();
        String player1 = ui.getPlayerName();
        String player2 = ui.getPlayerName();

        Deck newDeck = new Deck();

        newDeck.populateDeck();
        newDeck.shuffleCards();

        Card player1Card = newDeck.dealCard();
        Card player2Card = newDeck.dealCard();

        ArrayList<String> players;
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        ArrayList<Card> playerCards;
        playerCards = new ArrayList<>();
        playerCards.add(player1Card);
        playerCards.add(player2Card);

        String result = newDeck.higherCard(players, playerCards);

        ui.printResult(result, players, playerCards);

    }

}