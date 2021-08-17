import java.util.ArrayList;

public class Player {
    int points;
    ArrayList<Character> cardList = new ArrayList<>();

    public Player() {
    }

    public Player(String type) {
        if (type.equals("Emperor")) {
            giveEmperorCards();
        }
        if (type.equals("Slave")) {
            giveSlaveCards();
        }
        points = 0;
    }

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
