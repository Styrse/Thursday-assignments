import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Styrbjørn", "Gullacksen", "Styrse"));
        customers.add(new Customer("Alessandra", "Sandoni", "Alex"));
        customers.add(new Customer("Carl", "Gullacksen", "Carlo"));

        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }

    }
}