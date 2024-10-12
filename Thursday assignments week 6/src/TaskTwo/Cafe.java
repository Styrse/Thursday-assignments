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

    //2. d
    public void loadMenuData(){

        //2. e
        try {
            File file = new File("src/TaskTwo/coffees.txt");
            Scanner scan = new Scanner(file);

            //2. f
            while (scan.hasNextLine()){
                cofffeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}