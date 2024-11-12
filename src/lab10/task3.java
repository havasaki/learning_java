package lab10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}

public class task3 {

    private Student[] students;

    // Метод для заполнения массива студентов
    public void setArray(int size) {
        students = new Student[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Введите имя студента: ");
            String name = scanner.nextLine();
            System.out.print("Введите средний балл студента: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // consume the newline
            students[i] = new Student(name, gpa);
        }
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Метод быстрой сортировки по среднему баллу
    public void quicksort() {
        Arrays.sort(students, Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Метод сортировки слиянием по среднему баллу
    public void mergeSort() {
        mergeSort(students, 0, students.length - 1);
    }

    private void mergeSort(Student[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(Student[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i].getGpa() >= rightArray[j].getGpa()) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        task3 sorter = new task3();

        // Заполнение массива студентов
        sorter.setArray(3);  // Например, вводим 3 студента

        System.out.println("Студенты до сортировки:");
        sorter.outArray();

        // Сортировка по среднему баллу
        sorter.quicksort();
        System.out.println("\nСтуденты после быстрой сортировки по GPA:");
        sorter.outArray();

        // Сортировка слиянием
        sorter.mergeSort();
        System.out.println("\nСтуденты после сортировки слиянием по GPA:");
        sorter.outArray();
    }
}