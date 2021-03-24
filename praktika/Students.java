package praktika;

public class Students {
    int Id_studenta;
    String Fam;
    String Name;
    int Groupa;
    int Department;
    String discipline;
    int mark;
    String NameTeacher;
    public Students (int Id_studenta, String Fam, String Name, int Groupa, int Department){
        this.Id_studenta = Id_studenta;
        this.Name = Name;
        this.Fam = Fam;
        this.Groupa = Groupa;
        this.Department = Department;
    }
    public static void main(String[] agrs){
         Students a = new Students(1,"Kuyn", "Oleksandr", 34, 121);
       System.out.println(a.Id_studenta);
       System.out.println(a.Fam);
       System.out.println(a.Name);
       System.out.println(a.Groupa);
       System.out.println(a.Department);
    }
}
