import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        //Initialize the RandomGenerator with the algorithm "L64X128MixRandom" from JDK 17
        RandomGenerator random = RandomGenerator.of("L64X128MixRandom");

        //Creates random number
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        
    }
}