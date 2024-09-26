import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        //Initialize the RandomGenerator with the algorithm "L64X128MixRandom" from JDK 17
        RandomGenerator random = RandomGenerator.of("L64X128MixRandom");

        //Creates random number
        int randomNumber = random.nextInt(minNumber, maxNumber);
        System.out.println(randomNumber);

        System.out.println("Lets play a game of Higher/Lower \nThe number is between 0 and 100");

        guess(randomNumber, minNumber, maxNumber);
    }

    static void guess(int randomNumber, int minNumber, int maxNumber) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your guess: ");
        int number = scan.nextInt();

        if (number < minNumber || number > maxNumber-1) {
            System.out.println("Please enter a number between " + minNumber + " and " + maxNumber);
            guess(randomNumber, minNumber, maxNumber);
        } else {
            count++;

            if (number == randomNumber) {
                System.out.println("Winner winner chicken dinner!");
                System.out.println("Guesses: " + count);
            } else if (number < randomNumber) {
                System.out.println("Higher");
                minNumber = number;
                System.out.println("The number is between " + minNumber + " and " + maxNumber);
                guess(randomNumber, minNumber, maxNumber);
            } else if (number > randomNumber){
                System.out.println("Lower");
                maxNumber = number;
                System.out.println("The number is between " + minNumber + " and " + maxNumber);
                guess(randomNumber, minNumber, maxNumber);
            }
        }
    }
}