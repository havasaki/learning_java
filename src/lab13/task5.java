package lab13;

public class task5 {
    private String countryCode;
    private String formattedNumber;

    // Конструктор, принимающий строку с номером телефона
    public task5(String phoneNumber) {
        if (isValidPhoneNumber(phoneNumber)) {
            parsePhoneNumber(phoneNumber);
        } else {
            throw new IllegalArgumentException("Invalid phone number format");
        }
    }

    // Метод для проверки формата телефонного номера
    private boolean isValidPhoneNumber(String phoneNumber) {
        // Проверка на формат +<Код страны><10 цифр> или 8<10 цифр>
        return phoneNumber.matches("\\+\\d{1,3}\\d{10}") || phoneNumber.matches("8\\d{10}");
    }

    // Метод для парсинга телефонного номера
    private void parsePhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            int len = phoneNumber.length();
            countryCode = phoneNumber.substring(1, len - 10);
            formattedNumber = phoneNumber.substring(len - 10);
        } else if (phoneNumber.startsWith("8")) {
            countryCode = "7"; // Код России без 8
            formattedNumber = phoneNumber.substring(1);
        }
    }

    // Метод для получения отформатированного номера
    public String getFormattedNumber() {
        if (formattedNumber != null) {
            return "+" + countryCode + formattedNumber.substring(0, 3) + "-" +
                    formattedNumber.substring(3, 6) + "-" + formattedNumber.substring(6);
        }
        return null;
    }

    public static void main(String[] args) {
        task5 phone1 = new task5("+79175655655");
        task5 phone2 = new task5("89175655655");
        task5 phone3 = new task5("+104289652211");

        System.out.println(phone1.getFormattedNumber()); // +7 917-565-5655
        System.out.println(phone2.getFormattedNumber()); // +7 917-565-5655
        System.out.println(phone3.getFormattedNumber()); // +104 289-652-211

    }
}