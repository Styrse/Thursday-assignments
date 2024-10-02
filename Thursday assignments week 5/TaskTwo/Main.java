import java.util.Scanner;
//2. a
public class Main {
    public static void main(String[] args) {
        int retirementAge = 67;
 
        //2. b
        System.out.print("Please type your name: ");

        //2. c
        Scanner scan = new Scanner(System.in);
        //2. d
        String name = scan.nextLine();
        //2. e
        System.out.print("Hello" + name + " please type your age: ");
        //2. f
        int age = scan.nextInt();
        //2. g
        System.out.println("You are " + age + "years old");
        //2. h
        if (age == retirementAge) {
            System.out.println("You can retire now");
        } else if (age > retirementAge) {
            System.out.println("You have been retired for:  " + (age - retirementAge) + " years");
        } else {
            System.out.println("You can retire in: " + (retirementAge - age) + " years");
        }
        scan.close();
    }
}