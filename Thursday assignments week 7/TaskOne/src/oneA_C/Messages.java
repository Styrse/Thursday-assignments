package oneA_C;

//1. a
public class Messages {

    //1. b
    void methodA(String cake) {
        if (cake.contains("r")) {
            if (cake.equals("Strawberry")) {
                System.out.print('J');
                methodB(cake);
            } else if (cake.equals("Carrot")) {
                System.out.print('T');
                methodB(cake);
            } else {
                methodA("Mango cake");
            }
        } else if (cake.length() > 6 && cake.substring(1, 4).equals(cake.substring(3, 6))) {
            System.out.print('l');
            System.out.print('d');
            methodE(true, true);
        } else {
            System.out.println("Have a good day");
        }
    }

    //(cake.substring(1, 4) == cake.substring(3, 6))

    void methodB(String cake) {
        System.out.print('e');
        if (cake.length() == 6) {
            System.out.print('s');
            if (cake.charAt(2) == 'r') {
                System.out.print('s');
            }
        } else if (cake.length() <= 10 && cake.length() > 5) {
            System.out.print('s');
            System.out.print('p');
            methodB("Red Velvet Cake");
            methodD("Opera");
        }
        if (cake.equals("Strawberry") || cake.equals("Carrot")) {
            System.out.print(' ');
            if (cake.equals("Strawberry") || cake.equals("Carrot")) {
                methodC("Dream cake", false);
            }
        }

    }

    void methodC(String cake, boolean goodCake) {
        if (cake.startsWith("D")) {
            if (goodCake == true) {
                System.out.print('k');
                methodC("Eclair", false);
            } else {
                System.out.print('s');
                System.out.print('h');
                methodD("Berlingozzo");
            }
        } else if (goodCake != false) {
            System.out.print('i');
            System.out.print('n');
            methodE(true, false);
        } else {
            System.out.print('e');
        }
    }

    void methodD(String cake) {
        if (cake.equals("Opera")) {
            System.out.print('r');
        } else if (cake != "Berlingozzo") {
            methodC("Coffee", false);
        } else {
            System.out.print('o');
            System.out.print('u');
            methodA("Banana cake");
        }
    }

    void methodE(boolean goodCake, boolean badCake) {
        if (badCake == true) {
            System.out.print(' ');
            if (goodCake != !true) {
                System.out.print('b');
                methodD("Opera");
                methodC("Tiramisu", true);
            }
        } else if (goodCake == true && badCake == false) {
            System.out.print('g');
            methodE(false, true);
            System.out.print('c');
            System.out.print('a');
            methodC("Dream cake", true);
        }
    }

}

//Jesper/Tess should bring cake


