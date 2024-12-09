package lab20;

// Обобщенный класс с тремя параметрами
class Triple<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Triple(T first, V second, K third) {
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

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public void setThird(K third) {
        this.third = third;
    }
}

// Использование обобщенного класса
public class task1 {
    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("Test", 42, 3.14);

        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());
    }
}
