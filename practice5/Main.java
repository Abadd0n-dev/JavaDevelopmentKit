package practice5;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Philosopher[] philosophers = new Philosopher[5];
        Fork[] forks = new Fork[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Fork(i + 1);
        }
        for (int i = 0; i < 5; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % 5];
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(rightFork, leftFork, "Философ" + (i + 1));
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork, "Философ" + (i + 1));
            }

        }
        for(Philosopher  philosopher : philosophers){
            philosopher.start();
        }


    }

}
