package oneD;

public class Flows {

    public void methodA(String input) {
        System.out.print("J");
        if (!input.equals("start")) {
            System.out.print("b");
            methodB("start");
        } else {
            System.out.print("a");
            methodD(methodC(input));

        }
        System.out.print("s");
    }

    public void methodB(String start) {
        System.out.print("j");
    }

    public int methodC(String input) {
        System.out.print("v");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        if (number > 5) {
            System.out.print("e");
            System.out.print("r");
        } else {
            System.out.print("a");
        }
        System.out.print(" ");

    }


}
