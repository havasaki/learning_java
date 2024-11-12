package lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task3 {
    private String firstName;        // Имя студента
    private String lastName;         // Фамилия студента
    private Date birthDate;          // Дата рождения студента

    // Конструктор класса
    public task3(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // Метод toString, возвращающий имя и фамилию студента
    @Override
    public String toString() {
        return "Студент: " + firstName + " " + lastName;
    }

    // Метод для получения строкового представления даты рождения по заданному формату
    public String getFormattedBirthDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        // Создаем объект Student
        task3 student = new task3("Иван", "Иванов", new Date(100, 0, 1)); // Дата рождения: 1 января 2000 года

        // Вывод информации о студенте
        System.out.println(student);

        // Форматирование даты рождения
        String shortFormat = "dd.MM.yy"; // Короткий формат
        String mediumFormat = "dd MMM yyyy"; // Средний формат
        String fullFormat = "EEEE, dd MMMM yyyy"; // Полный формат

        System.out.println("Дата рождения (краткий формат): " + student.getFormattedBirthDate(shortFormat));
        System.out.println("Дата рождения (средний формат): " + student.getFormattedBirthDate(mediumFormat));
        System.out.println("Дата рождения (полный формат): " + student.getFormattedBirthDate(fullFormat));
    }
}