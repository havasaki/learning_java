package lab18;

public class task6 {
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Data for " + key);
        return key;
    }

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        task6 demo = new task6();

        // Выполните с правильным значением для ключа
        demo.printMessage("example"); // Ожидается вывод "Data for example"

        // Выполните с нулевым значением
        demo.printMessage(null); // Теперь исключение перехватывается
    }
}
