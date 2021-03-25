package praktika;

public class Order {
    int Id;
    String name;
    String courier;
    String dateTime;
    int type;
    public Order (int Id, String name, String courier){
        this.Id = Id;
        this.name = name;
        this.courier = courier;
    }
     @Override
     public String toString(){
        return this.Id +" "+ this.name +" "+ this.courier;
    }
}
