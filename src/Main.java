import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player Emperor = new Player("Emperor");
        Player Slave = new Player("Slave");

        System.out.println(Emperor.cardList);
        System.out.println(Slave.cardList);

        Random r = new Random();
        int num = r.nextInt(Emperor.cardList.size());

        for (int i = 0; i < 5; i++) {
            num = r.nextInt(Emperor.cardList.size());

            System.out.println(Emperor.cardList.get(num));
            Emperor.cardList.remove(num);

        }
    }
}
