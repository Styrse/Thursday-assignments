//1. a & 1. b
public class Messages {

    void methodA(String cake) {
        if (cake.equals("Strawberry")) {
            System.out.println('J');
        } else if (cake.equals("Carrot")) {
            System.out.println('T');
        }
        methodB(cake);
    }

    void methodB(String cake) {
        System.out.println('e');
        if (cake.length() == 6) {
            System.out.println('s');
            if (cake.charAt(2) == 'r') {
                System.out.println('s');
            }
        } else if (cake.length() <= 10 && cake.length() > 5) {
            System.out.println('s');
            System.out.println('p');
            methodB("Red Velvet Cake");
            methodD("Opera");
        }
        if (cake.equals("Strawberry") || cake.equals("Carrot")) {
            System.out.println(' ');
            methodC("Dream cake");
        }

    }

    void methodC(String cake) {
        if (cake.startsWith("D")) {
            System.out.println('s');
            System.out.println('h');
        }
    }

    void methodD(String cake) {
        if (cake.equals("Opera")) {
            System.out.println('r');
        } else if (cake != "Berlingozzo") {
            methodC("Coffee");
        }
    }
}

//Jesper/Tess should bring cake


