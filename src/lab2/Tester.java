package lab2;
import java.util.Scanner;

class Author{
    private String name;
    private String email;
    public char gender;
    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email=newEmail;
    }

    public char getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

}


public class Tester {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String name=scanner.nextLine();
        System.out.print("Введите email автора: ");
        String email = scanner.nextLine();
        System.out.print("Введите пол автора (M/F): ");
        char gender = scanner.next().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println("Информация об авторе:");
        System.out.println(author);
        System.out.print("Введите новый email для автора: ");
        scanner.nextLine();
        String newEmail = scanner.nextLine();
        author.setEmail(newEmail);
        System.out.println("Обновленная информация об авторе:");
        System.out.println(author);
        scanner.close();
    }

}
