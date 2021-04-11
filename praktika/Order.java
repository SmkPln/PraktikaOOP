package praktika;
public class Order{
    int Id;
    String name;
    String courier;
    String dateTime;
    int type;
    Order (int Id, String name, String courier){
        this.Id = Id;
        this.name = name;
        this.courier = courier;}
    Order(){this(1, "віник", "Rocket");}
    
    public int getId() {return Id;}

    public void setId(int Id) {this.Id = Id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getCourier() {return courier;}

    public void setCourier(String courier) {this.courier = courier;}

    public String getDateTime() {return dateTime;}

    public void setDateTime(String dateTime) {this.dateTime = dateTime;}

    public int getType() {return type;}
    
     public void setType(int type) {
        if(type == 1  || type == 2) {this.type = type;
        }else {System.out.println("Error");}}
     @Override
     public String toString(){
        return this.Id +" "+ this.name +" "+ this.courier;}}
