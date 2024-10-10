//1. a & 1. b
public class Messages {

    void methodA(String cake) {
        if (cake.contains("r")) {
            if (cake.equals("Strawberry")) {
                System.out.print('J');
            } else if (cake.equals("Carrot")) {
                System.out.print('T');
            }
            methodB(cake);
        } else {
            System.out.print('l');
            System.out.print('d');
            methodE(true, true);
        }
    }

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
            if (goodCake == true){
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
        } else if (goodCake == true && badCake == false){
            System.out.print('g');
            methodE(false,true);
            System.out.print('c');
            System.out.print('a');
            methodC("Dream cake", true);
        }
    }

}

//Jesper/Tess should bring cake


