package lab13;

public class task2 {
    private String lastName;
    private String firstName;
    private String middleName;

    public task2(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName != null ? firstName : "";  // Убираем возможные null
        this.middleName = middleName != null ? middleName : ""; // Убираем возможные null
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);

        // Проверяем наличие имени и отчества и добавляем инициалы
        if (!firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }

        return fullName.toString();
    }

    public static void main(String[] args) {
        task2 person1 = new task2("Иванов", "Иван", "Иванович");
        task2 person2 = new task2("Петров", null, null);

        System.out.println(person1.getFullName()); // Вывод: Иванов И. И.
        System.out.println(person2.getFullName()); // Вывод: Петров
    }
}