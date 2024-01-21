import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework12Program {
    public static final int LOTTERY_NUMBERS = 7;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] winningCombination = new int[LOTTERY_NUMBERS];
        int[] userCombination = new int[LOTTERY_NUMBERS];
        int numberOfCoincidences = 0;

        System.out.println("Enter seven numbers from your lottery ticket");
        for (int index = 0; index < LOTTERY_NUMBERS; index++) {
            System.out.println("Enter " + (1 + index) + " number");
            winningCombination[index] = random.nextInt(10);
            userCombination[index] = scanner.nextInt();
        }

        Arrays.sort(winningCombination);
        Arrays.sort(userCombination);

        for (int index = 0; index < LOTTERY_NUMBERS; index++) {
            if (winningCombination[index] == userCombination[index]) {
                numberOfCoincidences++;
            }
        }

        System.out.println(Arrays.toString(winningCombination));
        System.out.println(Arrays.toString(userCombination));
        System.out.println("Number of matches: " + numberOfCoincidences);
    }
}
