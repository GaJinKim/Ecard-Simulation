import java.util.Random;

/*
 * Simulation of e-card game from Kaiji Ultimate Survivor
 */
public class Main {
    public static void main(String[] args) {
        Player Emperor = new Player("Emperor");
        Player Slave = new Player("Slave");

        int simulationRuns = 100000;
        int eScore = 0;
        int sScore = 0;
        double eMultiplier = 1;
        double sMultiplier = 4;

        for (int i = 0; i < simulationRuns; i++) {
            Emperor.resetEmperorCards();
            Slave.resetSlaveCards();

            if (winner(Emperor, Slave).equals("Emperor")) {
                eScore++;
            } else {
                sScore++;
            }
        }

        eScore *= eMultiplier;
        sScore *= sMultiplier;

        System.out.println("emperor score: " + eScore);
        System.out.println("slave score:   " + sScore);
        System.out.println("score delta:   " + Math.abs(eScore - sScore));
    }

    public static String winner(Player e, Player s) {
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int eRand = rand.nextInt(e.cardList.size());
            int sRand = rand.nextInt(s.cardList.size());

            // Citizen vs Citizen
            if (e.cardList.get(eRand) == s.cardList.get(sRand)) {
                e.cardList.remove(eRand);
                s.cardList.remove(sRand);
            }

            // Citizen vs Slave
            else if (e.cardList.get(eRand) == 'C' && s.cardList.get(sRand) == 'S') {
                return "Emperor";
            }

            // Emperor vs Citizen
            else if (e.cardList.get(eRand) == 'E' && s.cardList.get(sRand) == 'C') {
                return "Emperor";
            }

            // Emperor vs Slave
            else if (e.cardList.get(eRand) == 'E' && s.cardList.get(sRand) == 'S') {
                return "Slave";
            }
        }
        return "invalid";
    }
}
