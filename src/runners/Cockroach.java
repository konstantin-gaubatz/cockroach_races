package runners;

import app.Race;

public class Cockroach extends Runner {

    public Cockroach(int num, String name, int distance) {
        super(num, name, distance);
    }

    @Override
    public void run() {
        for (int i = 1; i <= distance; i++) {
            System.out.println("₼ " + getName() + " number: " + getNum() + " started " + i + " lap!");
            long sleepTime = 2 + (long)(Math.random() * 4);
            try {
                Thread.sleep(sleepTime);
                System.out.println("₼ " + getName() + " number: " + getNum() + " loses " + sleepTime + " milliseconds on lap " + i + "!");
            } catch (InterruptedException error) {
                throw new RuntimeException(error);
            }
        }
        if (Race.winnerNum == 0) {
            Race.winnerNum = getNum();
            Race.winnerName = getName();
        }
    }
}
