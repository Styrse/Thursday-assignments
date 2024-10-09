package TaskTwo;

//2. c
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> cofffeMenu = new ArrayList<>();


    public ArrayList<String> getCofffeMenu() {
        return cofffeMenu;
    }

    public void setCofffeMenu(ArrayList<String> cofffeMenu) {
        this.cofffeMenu = cofffeMenu;
    }

    public void loadMenuData(){
        File file = new File("coffees.txt");
        try {
            Scanner fileReader = new Scanner(file);
            System.out.println(fileReader);
        } catch (FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
    }
}