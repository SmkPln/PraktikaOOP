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
     @Override
      public String toString(){
        return this.Id_studenta +" "+ this.Fam +" "+ this.Name+" "+ this.Groupa+ " "+ this.Department;
    }
    }

