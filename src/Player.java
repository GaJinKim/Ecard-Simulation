import java.util.ArrayList;

public class Player {
    public Player() {
    }

    public Player(String type) {
        if (type.equals("Emperor")) {
            giveEmperorCards();
        }
        if (type.equals("Slave")) {
            giveSlaveCards();
        }
    }

    int points;
    ArrayList<Character> cardList = new ArrayList<>();

    int returnPoints() {
        return points;
    }

    void giveEmperorCards() {
        cardList.add('C');
        cardList.add('C');
        cardList.add('C');
        cardList.add('C');
        cardList.add('E');
    }

    void giveSlaveCards() {
        cardList.add('C');
        cardList.add('C');
        cardList.add('C');
        cardList.add('C');
        cardList.add('S');
    }

    void resetEmperorCards() {
        cardList.clear();
        giveEmperorCards();
    }

    void resetSlaveCards() {
        cardList.clear();
        giveSlaveCards();
    }
}
