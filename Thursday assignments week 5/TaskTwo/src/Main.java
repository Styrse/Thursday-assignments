import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int retirementAge = 67;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        System.out.print(name + " enter your age: ");
        int age = scan.nextInt();

        if (age == retirementAge) {
            System.out.println("You can retire now");
        } else if (age > retirementAge) {
            System.out.println("You have been retired for:  " + (age - retirementAge) + " years");
        } else {
            System.out.println("You can retire in: " + (retirementAge - age) + " years");
        }
    }
}