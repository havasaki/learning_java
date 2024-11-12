package lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task5 {

    private static final int SIZE = 100000; // Размер списка
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        // Тестируем производительность ArrayList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заполнение списков
        for (int i = 0; i < SIZE; i++) {
            int randomValue = RANDOM.nextInt();
            arrayList.add(randomValue);

            linkedList.add(randomValue);
        }

        // Сравнение вставки
        testInsertion(arrayList, linkedList);
        // Сравнение удаления
        testRemoval(arrayList, linkedList);
        // Сравнение поиска
        testSearch(arrayList, linkedList);
    }

    private static void testInsertion(List<Integer> arrayList, List<Integer> linkedList) {
        long startTime, endTime;

        // ArrayList
        startTime = System.nanoTime();
        arrayList.add(0, 1); // Вставка в начало
        endTime = System.nanoTime();
        System.out.println("ArrayList Insert Time: " + (endTime - startTime) + " ns");

        // LinkedList
        startTime = System.nanoTime();
        linkedList.add(0, 1); // Вставка в начало
        endTime = System.nanoTime();
        System.out.println("LinkedList Insert Time: " + (endTime - startTime) + " ns");
    }

    private static void testRemoval(List<Integer> arrayList, List<Integer> linkedList) {
        long startTime, endTime;

        // Удаление первого элемента
        startTime = System.nanoTime();
        arrayList.remove(0); // Удаление первого элемента
        endTime = System.nanoTime();
        System.out.println("ArrayList Remove Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(0); // Удаление первого элемента
        endTime = System.nanoTime();
        System.out.println("LinkedList Remove Time: " + (endTime - startTime) + " ns");
    }

    private static void testSearch(List<Integer> arrayList, List<Integer> linkedList) {
        long startTime, endTime;

        // Поиск
        int toFind = arrayList.get(SIZE / 2); // Получаем элемент для поиска

        // ArrayList
        startTime = System.nanoTime();
        arrayList.contains(toFind);
        endTime = System.nanoTime();
        System.out.println("ArrayList Search Time: " + (endTime - startTime) + " ns");

        // LinkedList
        startTime = System.nanoTime();
        linkedList.contains(toFind);
        endTime = System.nanoTime();
        System.out.println("LinkedList Search Time: " + (endTime - startTime) + " ns");
    }
}