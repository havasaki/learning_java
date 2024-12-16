package lab17;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
    private String name;
    private int age;

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

class ListContainer {
    private ArrayList<Node> elements;

    public ListContainer() {
        elements = new ArrayList<>();
    }

    public void createEmptyList() {
        elements.clear();
        System.out.println("Создан пустой список.");
    }

    public void addElement() {
        Node newNode = new Node();
        newNode.readAttributes();
        elements.add(newNode);
    }

    public void removeElement() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс элемента для удаления: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
            System.out.println("Элемент удалён.");
        } else {
            System.out.println("Недопустимый индекс.");
        }
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (int i = 0; i < elements.size(); i++) {
            System.out.print("Элемент " + i + ": ");
            elements.get(i).displayAttributes();
        }
    }

    public void clearList() {
        elements.clear();
        System.out.println("Список очищен.");
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

public class task1 {
    public static void main(String[] args) {
        ListContainer container = new ListContainer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Создать пустой список");
            System.out.println("2. Добавить элемент");
            System.out.println("3. Удалить элемент");
            System.out.println("4. Вывести элементы");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить, пуст ли список");
            System.out.println("7. Выход");

            System.out.print("Выберите опцию: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    container.createEmptyList();
                    break;
                case "2":
                    container.addElement();
                    break;
                case "3":
                    container.removeElement();
                    break;
                case "4":
                    container.displayElements();
                    break;
                case "5":
                    container.clearList();
                    break;
                case "6":
                    if (container.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        System.out.println("Список не пуст.");
                    }
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}
