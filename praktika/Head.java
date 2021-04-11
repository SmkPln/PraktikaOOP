package praktika;
import java.util.*;
public class Head {
    public static void main(String[] args) {
      ContactCollection a = new ContactCollection();
      OrderCollection b = new  OrderCollection();
      StudentsCollection c = new StudentsCollection();
      Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
        while (!"4".equals(s)){
            System.out.println("\n1. Робота з контактами");
            System.out.println("2. Робота з заказами");
            System.out.println("3. Робота з студентами");
            System.out.println("4. Вихід");
            System.out.println("> ");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Error");}
            switch (x){
                case 1:
                            while (!"6".equals(s)){
                            System.out.println("\n1. Добавлення контакту");
                            System.out.println("2. Видалення контакту");
                            System.out.println("3. Перегляд контактів");
                            System.out.println("4. Запис в файл");
                            System.out.println("5. Сортування за id");
                            System.out.println("6. Вихід");
                            System.out.println("> ");
                            s = scan.next();
                            try {x = Integer.parseInt(s);
                            } catch (NumberFormatException e){
                                System.out.println("Error");}
                            switch (x){
                                case 1:
                                    a.addC();
                                    break;
                                case 2:
                                    a.DeleteS();
                                    break;
                                case 3:
                                    a.PrintC();
                                    break;
                                case 4:
                                    a.WCC();
                                    break;
                                case 5:
                                    a.Sort();}}
                    break;
                case 2:
                    while (!"6".equals(s)){
                            System.out.println("\n1. Добавлення заказу");
                            System.out.println("2. Видалення заказу");
                            System.out.println("3. Перегляд заказів");
                            System.out.println("4. Запис в файл");
                            System.out.println("5. Сортування за id");
                            System.out.println("6. Вихід");
                            System.out.println("> ");
                            s = scan.next();
                            try {x = Integer.parseInt(s);
                            } catch (NumberFormatException e){
                                System.out.println("Error");}
                            switch (x){
                                case 1:
                                    b.addO();
                                    break;
                                case 2:
                                    b.DeleteO();
                                    break;
                                case 3:
                                    b.PrintO();
                                    break;
                                case 4:
                                    b.WOC(); 
                                    break;
                                case 5:
                                    a.Sort();}}
                    break;
                case 3:
                    while (!"6".equals(s)){
                            System.out.println("\n1. Добавлення студента");
                            System.out.println("2. Видалення студента");
                            System.out.println("3. Перегляд студентів");
                            System.out.println("4. Запис в файл");
                            System.out.println("5. Сортування за групою");
                            System.out.println("6. Вихід");
                            System.out.println("> ");
                            s = scan.next();
                            try {x = Integer.parseInt(s);
                            } catch (NumberFormatException e){
                                System.out.println("Error");}
                            switch (x){
                                case 1:
                                    c.addS();
                                    break;
                                case 2:
                                    c.DeleteS();
                                    break;
                                case 3:
                                    c.PrintS();
                                    break;
                                case 4:
                                    c.WSC();
                                    break;
                                case 5:
                                    c.Sort();}}}}
        System.out.println("До побачення!");
}}