package lab14;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        String pattern = "^abcdefghijklmnopqrstuv18340$";
        String testString1 = "abcdefghijklmnopqrstuv18340"; // правильная строка
        String testString2 = "abcdefghijklmnoasdfasdpqrstuv18340"; // неправильная строка

        boolean matches1 = Pattern.matches(pattern, testString1);
        boolean matches2 = Pattern.matches(pattern, testString2);

        System.out.println("Строка 1 соответствует шаблону: " + matches1); // должно быть true
        System.out.println("Строка 2 соответствует шаблону: " + matches2); // должно быть false
    }
}