package app;

import runners.Cockroach;

import static utils.CockroachNames.generateName;

public class Race {

    public static int winnerNum = 0;
    public static String winnerName = "";

    public static void main(String[] args) throws InterruptedException {

        if (args.length != 2) {
            System.out.println("Error! Invalid arguments! Expected 2 arguments.");
            return;
        }

        int numOfRunners = 0;
        int distance = 0;


        try {
            numOfRunners = Integer.parseInt(args[0]);
            distance = Integer.parseInt(args[1]);
        } catch (NumberFormatException error) {
            System.out.println("Error! Both arguments must be integer.");
            return;
        }

        if (numOfRunners <= 0 || distance < 3) {
            System.out.println("Error! Number of runners must be > 0 and distance must be >= 3!");
            return;
        }

        System.out.println("Race starts now! " + numOfRunners + " cockroaches will run " + distance + " laps!");

        Cockroach[] cockroaches = new Cockroach[numOfRunners];
        Thread[] threads = new Thread[numOfRunners];

        for (int i = 0; i < numOfRunners; i++) {
            String name = generateName();
            cockroaches[i] = new Cockroach(i + 1, name, distance);
            threads[i] = new Thread(cockroaches[i]);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Congratulation! Winner: " + winnerName + " he was number: " + winnerNum);
    }
}
