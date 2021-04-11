package praktika;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ContactCollection {
public ArrayList<Contact> list1 = new ArrayList<>();{
    list1.add(createModel(1, "Олександр", "Куян", "Небесна сотня 110"));
    list1.add(createModel(2, "Владислав", "Чепорян", "Європейська 32"));
    list1.add(createModel(5, "Юрій", "Пустошний", "Сонячна 21"));
    list1.add(createModel(4, "Гарік", "Омель", "Зелена 89"));
    list1.add(createModel(3, "Микола", "Старожил", "Бунова 1"));}
public void addC(){
    int id;
    String firstName;
    String lastName;
    String address;
   Scanner osScan = new Scanner(System.in, "windows-1251");
   Scanner oiScan = new Scanner(System.in, "windows-1251");
   System.out.println("Id: ");
   id = oiScan.nextInt();
   System.out.println("Прізвище: ");
   firstName = osScan.nextLine();
   System.out.println("Ім'я: ");
   lastName = osScan.nextLine();
   System.out.println("Адреса: ");
   address = osScan.nextLine();
   list1.add(new Contact(id, firstName, lastName, address));
   System.out.println("\n");}

public void DeleteS(){
int id;
System.out.println("> ");
Scanner oiScan = new Scanner(System.in, "windows-1251");
id = oiScan.nextInt();
list1.remove(Contact(id));}
        
public void Sort(){
Collections.sort(list1, (Contact o1, Contact o2) -> Integer.compare(o1.getId() , o2.getId()));}
public void PrintC(){
for(int i =0; i<list1.size(); i++)
    {System.out.println(list1.get(i));}}

@Override
public String toString() {return " " +list1;}
    
public void WCC() {
        try(FileWriter fileWriter = new FileWriter("ContactCollection.txt")){
            fileWriter.write(toString());}
        catch(IOException ex){
            System.out.println(ex.getMessage());}}
public static Contact createModel(int id, String firstName, String lastName, String address)
{Contact a1 = new Contact();
a1.setId(id);
a1.setFirstName(firstName);
a1.setLastName(lastName);
a1.setAddress(address);
return a1;}
    private int Contact(int id) {
    return id-1;
    }}