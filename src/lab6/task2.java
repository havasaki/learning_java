package lab6;

// Интерфейс Priceable
interface Priceable {
    double getPrice();
}

// Класс Product, реализующий интерфейс Priceable
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price + " $";
    }
}

// Класс Service, реализующий интерфейс Priceable
class Service implements Priceable {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Service(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return name + ": " + getPrice() + " $ (Hourly Rate: " + hourlyRate + " $ for " + hoursWorked + " hours)";
    }
}

// Главный класс для тестирования
public class task2 {
    public static void main(String[] args) {
        Priceable item1 = new Product("Laptop", 1200.00);
        Priceable item2 = new Product("Smartphone", 800.00);
        Priceable service1 = new Service("Consultation", 100.00, 3);

        System.out.println(item1);
        System.out.println("Price: " + item1.getPrice() + " $");

        System.out.println(item2);
        System.out.println("Price: " + item2.getPrice() + " $");

        System.out.println(service1);
        System.out.println("Price: " + service1.getPrice() + " $");
    }
}