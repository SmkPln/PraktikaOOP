package praktika;
public class Contact {
    int id;
    String firstName;
    String lastName;
    String address;
   
    public Contact (String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;}
    Contact(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;}

    public int getId() {return id; }
 
    public void setId(int id) {this.id =id;}
    
    Contact()
    {this( 1, "Alex", "Kuyn", "Nebesnya Sotnya 110");}
    
    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getAddress() {return address;}

    public void setAddress(String adress) {this.address = adress;}
   
    @Override
    public String toString(){return this.id + " " + this.firstName +" "+ this.lastName+ " "+ this.address;}
}