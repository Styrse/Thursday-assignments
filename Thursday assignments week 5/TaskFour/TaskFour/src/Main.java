import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<String> menuSnake = new ArrayList<>(Arrays.asList("Start game", "Resume game", "Pause game", "End game"));

    public static void main(String[] args) {

        GameMenu menuOne = new GameMenu(menuSnake);

        menuOne.displayMenu();

    }
}