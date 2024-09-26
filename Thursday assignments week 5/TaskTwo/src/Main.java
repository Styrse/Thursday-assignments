import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanName = new Scanner(System.in);
       System.out.print("Enter your name: ");

       String name = scanName.nextLine();

       System.out.print(name + "enter your age: ");
       Scanner scanAge = new Scanner(System.in);

       int age = scanAge.nextLine();

       System.out.print(age);
    }
}