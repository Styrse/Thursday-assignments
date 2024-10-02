import java.util.ArrayList;

//4. a
public class GameMenu {

    //4. b
    private static ArrayList<String> actions;

    //4. c
    GameMenu(ArrayList<String> actions) {
        //4. d
        this.actions = actions;
    }

    //4. h
    public static void displayMenu() {
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(actions.get(i));
        }
    }
}