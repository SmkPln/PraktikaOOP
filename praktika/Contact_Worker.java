package praktika;
public class Contact_Worker extends Contact {
    String position;
    public Contact_Worker(String firstName, String lastName, String address, String position) {
        super(firstName, lastName, address);
       this.position = position; }
    Contact_Worker()
    {this("Alex", "Kuyn", "Nebesnya Sotnya 110", "student");}
    public String getposition() {
        return position;}

    public void setposition(String position) {
        this.firstName = position;}
    @Override
    public String toString(){
        return this.firstName +" "+ this.lastName+ " "+ this.address +" "+ this.position + " ";}}
