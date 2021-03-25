package praktika;

public class Contact {

    int id;
    String firstName;
    String lastName;
    String address;
   
    public Contact (String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    @Override
    public String toString(){
        return this.firstName +" "+ this.lastName+ " "+ this.address;}
}

