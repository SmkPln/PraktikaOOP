package praktika;

public class Contact_Worker extends Contact {
    String position;

    public Contact_Worker(String firstName, String lastName, String address, String position) {
        super(firstName, lastName, address);
       this.position = position; 
    }
    public void tell(){
     
    System.out.println(position);}
}
