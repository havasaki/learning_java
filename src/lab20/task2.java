package lab20;

// Обобщенный класс с тремя переменными
class Triple1<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Triple1(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    // Метод, выводящий на консоль имена классов для трех переменных
    public void printClassNames() {
        System.out.println("Class of First: " + first.getClass().getName());
        System.out.println("Class of Second: " + second.getClass().getName());
        System.out.println("Class of Third: " + third.getClass().getName());
    }
}

// Использование обобщенного класса
public class task2 {
    public static void main(String[] args) {
        Triple1<String, Integer, Double> triple = new Triple1<>("Test", 42, 3.14);

        // Вывод значений переменных
        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());

        // Вывод имен классов
        triple.printClassNames();
    }
}
