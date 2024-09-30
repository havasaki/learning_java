package lab4;
abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Тип фигуры: " + getType() +
                ", Площадь: " + getArea() +
                ", Периметр: " + getPerimeter();
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Подкласс Square
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }
}

// Класс-тестер
