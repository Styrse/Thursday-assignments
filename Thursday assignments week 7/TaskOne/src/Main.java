import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Messages msg = new Messages();
        System.out.print("Pick a cake: Strawberry or Carrot: ");
        Scanner scan = new Scanner(System.in);
        msg.methodA(scan.nextLine());
    }
}