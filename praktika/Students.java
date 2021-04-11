package praktika;
public class Students{
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
        this.Department = Department;}
     public Students()
    {this(111, "Kuyn", "Alex", 34, 121);}
    
    public int getId_Studenta() {return Id_studenta;}

    public void setId_Studenta(int Id_Studenta) {this.Id_studenta = Id_Studenta;}

    public String getFam() {return Fam;}

    public void setFam(String Fam) {this.Fam = Fam;}

    public String getName() {return Name;}

    public void setName(String Name) {this.Name = Name;}

    public int getGroupa() {return Groupa;}

    public void setGroupa(int Groupa) {this.Groupa = Groupa;}

    public int getDepartment() {return Department;}

    public void setDepartment(int Department) {this.Department = Department;}

    public String getDiscipline() {return discipline;}

    public void setDiscipline(String discipline) {this.discipline = discipline;}

    public double getMark() {return mark;}

    public void setMark(int mark) {this.mark = mark;}

    public String getNameTeacher() {return NameTeacher;}

    public void setNameTeacher(String NameTeacher) {this.NameTeacher = NameTeacher;}

    @Override
      public String toString(){
        return this.Id_studenta +" "+ this.Fam +" "+ this.Name+" "+ this.Groupa+ " "+ this.Department;}}