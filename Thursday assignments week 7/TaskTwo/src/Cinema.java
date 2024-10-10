public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++) {                                                    //Initialized the array seats ***
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";
            }
        }
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (row < getRows() + 1 && row > 0 && seat < getSeats() + 1 && seat > 0) {          //Added checker to avoid outOfBound ***
            if (seats[row - 1][seat - 1].equals("O")) {                                     //added -1 ***
                seats[row - 1][seat - 1] = "X";                                             //added -1 ***
                return true;
            }
        } else {
            System.out.println("Please enter a row number between 1 and " + getRows() + " and a seat between 1 and " + getSeats());
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (row < getRows() + 1 && row > 0 && seat < getSeats() + 1 && seat > 0) {          //Added checker to avoid outOfBound ***
            if (seats[row - 1][seat - 1].equals("X")) {                                     //added -1  and capitalized "X" ***
                seats[row - 1][seat - 1] = "O";                                             //added -1 ***
                return true;
            }
        } else {
            System.out.println("Please enter a row number between 1 and " + getRows() + " and a seat between 1 and " + getSeats());
        }
        return false;
    }

    public String toString() {
        String result = "";                                                                 //Changed to "" instead of null ***
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
