package praktika;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentsCollection {
    public ArrayList<Students> list3 = new ArrayList<>();{
    list3.add(createModel3(145, "Куян", "Олександр", 34, 121));
    list3.add(createModel3(223, "Чередниченко", "Сергій", 34, 121));
    list3.add(createModel3(590, "Клименко", "Роман", 34, 121));
    list3.add(createModel3(412, "Тищенко",  "Максим", 43, 143));
    list3.add(createModel3(342, "Максимов",  "Олег", 21, 143));}
    
public void addS(){
int Id_studenta;
String Fam;
String Name;
int Groupa;
int Department;
   Scanner osScan = new Scanner(System.in, "windows-1251");
   Scanner oiScan = new Scanner(System.in, "windows-1251");
   System.out.println("Номер залікової книжки: ");
   Id_studenta = oiScan.nextInt();
   System.out.println("Прізвище: ");
   Fam = osScan.nextLine();
   System.out.println("Ім'я: ");
   Name = osScan.nextLine();
   System.out.println("Група: ");
   Groupa = oiScan.nextInt();
   System.out.println("Кафедра: ");
   Department = oiScan.nextInt();
   list3.add(new Students(Id_studenta, Fam, Name, Groupa, Department));
   System.out.println("\n\n");}
        
public void DeleteS(){
int Id_studenta;
System.out.println("> ");
Scanner oiScan = new Scanner(System.in, "windows-1251");
Id_studenta = oiScan.nextInt();
list3.remove(Students(Id_studenta));}

public void Sort(){
 Collections.sort(list3, new Comparator<Students>(){
         @Override
         public int compare(Students o1, Students o2){
             return Integer.compare(o1.getGroupa() , o2.getGroupa());
         }});}

public void PrintS(){
for(int i =0; i<list3.size(); i++)
    {System.out.println(list3.get(i));}}

    @Override
    public String toString() {
        return " \n" +list3;}

public void WSC() {
        try(FileWriter fileWriter = new FileWriter("StudentsCollection.txt"))
        {fileWriter.write(toString());}
        catch(IOException ex){
            System.out.println(ex.getMessage());}}

   public static Students createModel3(int Id_studenta, String Fam, String Name, int Groupa, int Department)
   {Students a1 = new Students();
   a1.setId_Studenta(Id_studenta);
   a1.setFam(Fam);
   a1.setName(Name);
   a1.setGroupa(Groupa);
   a1.setDepartment(Department);
   return a1;}

    private int Students(int Id_studenta) {
        return Id_studenta-1;
    }}
