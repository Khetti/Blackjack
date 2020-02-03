import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    public void welcome() {
        System.out.println("Welcome to blackjack!");
    }

    public String getPlayerName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        String name = sc.nextLine();
        return name;
    }

    public void printResult(String result, ArrayList<String> players, ArrayList<Card> cards) {
        String player1Value = cards.get(0).getCard();
        String player1Name = players.get(0);
        String player2Value = cards.get(1).getCard();
        String player2Name = players.get(1);
        System.out.println(result + "\n" + player1Name + "'s card: " + player1Value + "\n" + player2Name + "'s card: " + player2Value);
    }

}