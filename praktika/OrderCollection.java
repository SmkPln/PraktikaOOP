package praktika;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OrderCollection {
   
public ArrayList<Order> list2 = new ArrayList<>();{
    list2.add(createModel(1, "Книжки", "Rocket"));
    list2.add(createModel(2, "Зошити", "AliExpress"));
    list2.add(createModel(5, "Ручки", "AliExpress"));
    list2.add(createModel(4, "Олівці", "AliBaba"));
    list2.add(createModel(3, "Листи А4", "AliBaba"));
}

public void addO(){
int id;
String name;
String courier;
   Scanner osScan = new Scanner(System.in, "windows-1251");
   Scanner oiScan = new Scanner(System.in, "windows-1251");
   System.out.println("Id: ");
   id = oiScan.nextInt();
   System.out.println("Назва товару: ");
   name = osScan.nextLine();
   System.out.println("Кур'єр: ");
   courier = osScan.nextLine();
   list2.add(new Order(id, name, courier));
   System.out.println("\n\n");}

public void DeleteO(){
int id;
System.out.println("> ");
Scanner oiScan = new Scanner(System.in, "windows-1251");
id = oiScan.nextInt();
list2.remove(Order(id));}
        
public void Sort(){
 Collections.sort(list2, new Comparator<Order>()
        {
         @Override
         public int compare(Order o1, Order o2){
             return Integer.compare(o1.getId() , o2.getId());}
        });}

public void PrintO(){
for(int i =0; i<list2.size(); i++)
    {System.out.println(list2.get(i));}}

    @Override
    public String toString() {return " \n" +list2;}

public void WOC() {
        try(FileWriter fileWriter = new FileWriter("OrderCollection.txt")){
            fileWriter.write(toString());}
        catch(IOException ex){
            System.out.println(ex.getMessage());}}

   public static Order createModel(int id, String name, String courier)
   {Order a1 = new Order();
   a1.setId(id);
   a1.setName(name);
   a1.setCourier(courier);
   return a1; }

    private int Order(int id) {
        return id-1;}}
