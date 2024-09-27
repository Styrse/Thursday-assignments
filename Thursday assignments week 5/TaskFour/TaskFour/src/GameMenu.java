import java.util.ArrayList;

public class GameMenu {

    ArrayList<String> menu = new ArrayList<String>();

    GameMenu(ArrayList<String> menu){
        this.menu = menu;
    }

    void displayMenu(){
        for (int i = 0; i < menu.size(); i++){
            System.out.println(menu.get(i));
        }
    }
}
