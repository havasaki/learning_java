package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String[] passwords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007",
                "Valid1_Password",
                "12345678"
        };

        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

        Pattern pattern = Pattern.compile(passwordRegex);

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println(password + " - надежный пароль.");
            } else {
                System.out.println(password + " - ненадежный пароль.");
            }
        }
    }
}
