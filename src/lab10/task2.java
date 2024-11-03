package lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        // Создаем два списка студентов
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        // Заполняем первый список
        list1.add(new Student("Ivan", "Ivanov", "Computer Science", 2, "CS-21"));
        list1.add(new Student("Anna", "Petrova", "Mathematics", 1, "MATH-10"));

        // Заполняем второй список
        list2.add(new Student("Petr", "Sidorov", "Physics", 3, "PHY-15"));
        list2.add(new Student("Olga", "Smirnova", "Chemistry", 2, "CHEM-22"));

        // Объединяем списки
        List<Student> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);

        // Сортируем по фамилии
        Collections.sort(combinedList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });

        // Выводим отсортированный список
        for (Student student : combinedList) {
            System.out.println(student);
        }
    }
}