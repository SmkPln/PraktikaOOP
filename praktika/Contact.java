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
    public static void main(String[] agrs){
         Contact a = new Contact("Alex","Kyan","Nebesnay Sotnya 110");
       System.out.println(a.firstName);
       System.out.println(a.lastName);
       System.out.println(a.address);
    }
}

