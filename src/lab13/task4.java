package lab13;

class Shirt {
    private String code;
    private String description;
    private String color;
    private String size;

    // Конструктор
    public Shirt(String code, String description, String color, String size) {
        this.code = code;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    // Метод toString для форматированного вывода информации о рубашке
    @Override
    public String toString() {
        return "Shirt Code: " + code + "\n" +
                "Description: " + description + "\n" +
                "Color: " + color + "\n" +
                "Size: " + size + "\n";
    }
}

public class task4 {
    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        // Преобразование строкового массива в массив объектов класса Shirt
        Shirt[] shirtArray = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            String[] parts = shirts[i].split(",");
            shirtArray[i] = new Shirt(parts[0], parts[1], parts[2], parts[3]);
        }

        // Вывод информации о рубашках на консоль
        for (Shirt shirt : shirtArray) {
            System.out.println(shirt);
        }
    }
}