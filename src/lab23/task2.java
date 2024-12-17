package lab23;

interface Queue {
    // Предусловие: -
    // Постусловие: элемент добавлен в очередь.
    void enqueue(Object element);

    // Предусловие: очередь не пустая.
    // Постусловие: возвращён первый элемент, который был удалён из очереди.
    Object dequeue();

    // Предусловие: очередь не пустая.
    // Постусловие: возвращён первый элемент.
    Object element();

    // Постусловие: возвращён текущий размер очереди.
    int size();

    // Постусловие: возвращено значение "истина", если очередь пуста, иначе "ложь".
    boolean isEmpty();

    // Постусловие: очередь очищена.
    void clear();
}
class LinkedQueue implements Queue {
    private static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Object dequeue() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        Object element = head.data;
        head = head.next;
        size--;
        if (size == 0) tail = null; // Очистка tail, если очередь пустая
        return element;
    }

    public Object element() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }
}
abstract class AbstractQueue1 implements Queue {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
public class task2 {
    public static void main(String[] args) {
        // Создание экземпляра очереди на связанном списке
        LinkedQueue linkedQueue = new LinkedQueue();

        // Тестирование добавления элементов
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        System.out.println(linkedQueue.size()); // Ожидание: 3

        // Тестирование первого элемента в очереди
        System.out.println(linkedQueue.element()); // Ожидание: 1

        // Тестирование удаления элементов
        System.out.println(linkedQueue.dequeue()); // Ожидание: 1
        System.out.println(linkedQueue.size());    // Ожидание: 2

        // Тестирование, что первый элемент после удаления
        System.out.println(linkedQueue.element()); // Ожидание: 2

        // Тестирование очистки очереди
        linkedQueue.clear();
        System.out.println(linkedQueue.isEmpty()); // Ожидание: true

        // Тестирование исключений
        try {
            linkedQueue.dequeue(); // Ожидание исключения
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Ожидание: "Queue is empty"
        }

        try {
            linkedQueue.element(); // Ожидание исключения
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Ожидание: "Queue is empty"
        }
    }
}
