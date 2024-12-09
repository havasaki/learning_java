package lab20;

import java.io.Serializable;

class Animal {
    // Поля и методы класса Animal
}

class Dog extends Animal implements Serializable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "'}";
    }
}

class Triple3<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    public Triple3(T first, V second, K third) {
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

    public void printClassNames() {
        System.out.println("Class of First: " + first.getClass().getName());
        System.out.println("Class of Second: " + second.getClass().getName());
        System.out.println("Class of Third: " + third.getClass().getName());
    }
}

public class task3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Triple3<String, Dog, Integer> triple = new Triple3<>("Test", dog, 42);

        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());

        triple.printClassNames();
    }
}
