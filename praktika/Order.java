package praktika;

public class Order {
    int Id;
    String Name;
    String courier;
    String dateTime;
    int type;
    public Order (int Id, String Name, String courier){
        this.Id = Id;
        this.Name = Name;
        this.courier = courier;
    }
    public static void main(String[] agrs){
         Order first = new Order(1,"Computer","Vasya");
       System.out.println(first.Id);
       System.out.println(first.Name);
       System.out.println(first.courier);
    }
}
