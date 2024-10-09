//3. a
public class Room {

    private int numberOfRooms;
    private int numberOfLamps;
    private int numberOfWindows;

    //3. b
    Room(int numberOfRooms, int numberOfLamps, int numberOfWindows) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //3. c
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
