package lab23;
class ArrayQueueModule {
    private static Object[] queue;
    private static int head;
    private static int tail;
    private static int size;

    static {
        // Инициализация переменных
        queue = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Предусловие: размер очереди < размер массива.
    // Постусловие: элемент добавлен в очередь.
    static void enqueue(Object element) {
        if (size == queue.length) {
            resize();
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    // Предусловие: очередь не пустая.
    // Постусловие: возвращён первый элемент, который был удалён из очереди.
    static Object dequeue() {
        Object element = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return element;
    }

    // Предусловие: очередь не пустая.
    // Постусловие: возвращён первый элемент.
    static Object element() {
        return queue[head];
    }

    // Постусловие: возвращён текущий размер очереди.
    static int size() {
        return size;
    }

    // Постусловие: возвращено значение "истина", если очередь пуста, иначе "ложь".
    static boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена.
    static void clear() {
        head = tail = size = 0;
    }

    private static void resize() {
        Object[] newArray = new Object[2 * queue.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = queue[(head + i) % queue.length];
        }
        queue = newArray;
        head = 0;
        tail = size;
    }
}
class ArrayQueueADT {
    private Object[] queue;
    private int head;
    private int tail;
    private int size;

    public ArrayQueueADT() {
        queue = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Предусловие: размер очереди < размер массива.
    // Постусловие: элемент добавлен в очередь.
    void enqueue(Object element) {
        if (size == queue.length) {
            resize();
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    Object dequeue() {
        Object element = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return element;
    }

    Object element() {
        return queue[head];
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void clear() {
        head = tail = size = 0;
    }

    private void resize() {
        Object[] newArray = new Object[2 * queue.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = queue[(head + i) % queue.length];
        }
        queue = newArray;
        head = 0;
        tail = size;
    }
}
class ArrayQueue {
    private Object[] queue;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue() {
        queue = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Предусловие: размер очереди < размер массива.
    // Постусловие: элемент добавлен в очередь.
    public void enqueue(Object element) {
        if (size == queue.length) {
            resize();
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public Object dequeue() {
        Object element = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return element;
    }

    public Object element() {
        return queue[head];
    }

    public int size() {

        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = tail = size = 0;
    }

    private void resize() {
        Object[] newArray = new Object[2 * queue.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = queue[(head + i) % queue.length];
        }
        queue = newArray;
        head = 0;
        tail = size;
    }
}
public class task1 {
    public static void main(String[] args) {
        // Тест для ArrayQueueModule
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println(ArrayQueueModule.dequeue()); // 1
        System.out.println(ArrayQueueModule.size());    // 1
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // true

        // Тест для ArrayQueueADT
        ArrayQueueADT qADT = new ArrayQueueADT();
        qADT.enqueue(3);
        qADT.enqueue(4);
        System.out.println(qADT.dequeue()); // 3
        System.out.println(qADT.size());     // 1
        qADT.clear();
        System.out.println(qADT.isEmpty());  // true

        // Тест для ArrayQueue
        ArrayQueue q = new ArrayQueue();
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.dequeue()); // 5
        System.out.println(q.size());     // 1
        q.clear();
        System.out.println(q.isEmpty());  // true
    }
}
abstract class AbstractQueue implements Queue {
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
