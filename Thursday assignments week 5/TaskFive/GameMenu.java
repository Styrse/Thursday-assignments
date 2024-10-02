import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {

    private static ArrayList<String> actions;

    GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public static void displayMenu() {
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(i + ": " + actions.get(i));
        }
    }

    //5. a
    public int getAction() {
        displayMenu();
        System.out.print("Type a number to choose an action: ");

        //5. b
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        //5. f
        switch (choice) {
        case 0:
            System.out.println("Starting the game now");
            break;
        case 1:
            System.out.println("Fetching previously saved game data");
            break;
        case 2:
            System.out.println("Game paused");
            break;
        case 3:
            System.out.println("Ending game");
            break;
        }

        return choice;
    }
}