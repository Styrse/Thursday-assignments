package TaskThree;

import java.util.ArrayList;

//3. g
public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(4, 8);
        Room room2 = new Room(3, 6);
        Room room3 = new Room(6, 8);

        //3. h
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        //3. i
        Building building1 = new Building(rooms, 3);

        //3. j
        System.out.println("Total amount of lamps: " + countLamps(building1));
        System.out.println("Total amount of windows: " + countWindows(building1));

        //3. k
        if (isNormal(building1)) {
            System.out.println("Normal building");
        } else {
            System.out.println("Abnormal building");
        }

    }
    //3. j
    public static int countLamps(Building building) {
        int totalLamps = 0;
        for (int i = 0; i < building.getRooms().size(); i++) {
            totalLamps += building.getRooms().get(i).getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindows(Building building){
        int totalWindows = 0;
        for (int i = 0; i < building.getRooms().size(); i++){
            totalWindows += building.getRooms().get(i).getNumberOfWindows();
        }
        return totalWindows;
    }
    //3. k
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() >= building.getRooms().size();
    }
}