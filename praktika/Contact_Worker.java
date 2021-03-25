package praktika;

public class Contact_Worker extends Contact {
    String position;

    public Contact_Worker(String firstName, String lastName, String address, String position) {
        super(firstName, lastName, address);
       this.position = position; 
    }
    @Override
    public String toString(){
        return this.firstName +" "+ this.lastName+ " "+ this.address +" "+ this.position + " ";}
    
}
