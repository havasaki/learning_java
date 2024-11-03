package lab9;
import java.util.Arrays;

 class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Сравнение по возрасту
        return Integer.compare(this.age, other.age);
    }
    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}
public class task2 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        Arrays.sort(people); // Сортировка по возрасту

        for (Person person : people) {
            System.out.println(person);
        }
    }
}