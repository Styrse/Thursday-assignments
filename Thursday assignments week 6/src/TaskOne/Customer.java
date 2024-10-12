package TaskOne;

//1. a
public class Customer {

    private String firstname;
    private String lastname;
    private String username;
    private int id;
    private static int count = 1;

    //1. b
    public Customer(String firstname, String lastname, String username) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        //1. c
        this.id = count++;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getId(){
        return id;
    }

    //1. d
    public String toString(){
        return "Customer:" + "\nID: " + id + "\nName: " + firstname + " " + lastname + "\nUsername: " + username;
    }
}