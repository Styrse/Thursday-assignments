public class Customer {

    String firstname;
    String lastname;
    String username;
    int ID;
    int count;

    Customer(String firstname, String lastname, String username){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        count++;
        this.ID = count;
    }
}
