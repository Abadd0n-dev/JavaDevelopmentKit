import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int totalTests = 1000;
        Map<Integer, Boolean> results = new HashMap<>();

        for (int i = 1; i <= totalTests; i++) {
            boolean win = doMontyHall();
            results.put(i, win);
        }

        int wins = (int) results.values().stream().filter(Boolean::booleanValue).count();
        int losses = totalTests - wins;

        System.out.println("Статистика по " + totalTests + " тестам:");
        System.out.println("Победы: " + wins);
        System.out.println("Поражения: " + losses);
    }

    private static boolean doMontyHall() {
        Random random = new Random();

        int win = random.nextInt(3) + 1;
        int selected = random.nextInt(3) + 1;
        int opened;
        do {
            opened = random.nextInt(3) + 1;
        } while (opened == win || opened == selected);

        if (random.nextBoolean()) {
            int newSelected;
            do {
                newSelected = random.nextInt(3) + 1;
            } while (newSelected == selected || newSelected == opened);
            selected = newSelected;
        }

        return selected == win;
    }
}
