package lab9;

class Student{
    private String name;
    private int iDNumber;
    public Student(String name, int IDNumber){
        this.name=name;
        this.iDNumber=IDNumber;
    }
    public int getiDNumber(){
        return iDNumber;
    }
    public String getName(){
        return name;
    }
}




public class task1 {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            // Перемещаем элементы students[0..i-1], которые больше ключа,
            // на одну позицию вперед от их текущей позиции
            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3),
                new Student("Bob", 1),
                new Student("Charlie", 2)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getiDNumber());
        }

        insertionSort(students);

        System.out.println("\nПосле сортировки по iDNumber:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getiDNumber());
        }
    }
}