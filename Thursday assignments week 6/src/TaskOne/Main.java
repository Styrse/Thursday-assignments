package TaskOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //1. e
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Styrbjørn", "Gullacksen", "Styrse"));
        customers.add(new Customer("Alessandra", "Sandoni", "Alex"));
        customers.add(new Customer("Carl", "Gullacksen", "Carlo"));

        //1. f
        printCustomers(customers);
    }

    //1. f
    public static void printCustomers(ArrayList customers){
        for (Object customer : customers) {
            System.out.println(customer);
        }
    }
}
