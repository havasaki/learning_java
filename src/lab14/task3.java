package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"
        };

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(emailRegex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " - корректный email.");
            } else {
                System.out.println(email + " - некорректный email.");
            }
        }
    }
}