package praktika;
import praktika.Contact;
import praktika.Contact_Worker;
import praktika.Order;
import praktika.Students;

public class Head {
    public static void main(String[] args) {
        Contact a1 = new Contact("Alex", "Kuyn", "Nebesnya Sotnya 110");
        System.out.println(a1);
       
        Contact_Worker aa1 = new Contact_Worker("Alex", "Kuyn", "Nebesnya Sotnya 110", "clown");
        System.out.println(aa1);
       
        Order b1 = new Order(1, "Vlad", "courier");
        System.out.println(b1);
        
        Students c1 = new Students(1,"Oleksandr","Kuyn",34,121);
        System.out.println(c1);
}
}