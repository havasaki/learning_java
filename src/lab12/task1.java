package lab12;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Абстрактный класс Shape
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

// Класс Circle, наследующий от Shape
class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}

// Класс Rectangle, наследующий от Shape
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

// Основной класс для создания окна
public class task1 extends JPanel {
    private List<Shape> shapes;

    public task1() {
        shapes = new ArrayList<>();
        generateRandomShapes(20);
    }

    private void generateRandomShapes(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(400);
            int y = random.nextInt(300);
            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10; // Радиус от 10 до 60
                shapes.add(new Circle(randomColor, x, y, radius));
            } else {
                int width = random.nextInt(100) + 10; // Ширина от 10 до 110
                int height = random.nextInt(100) + 10; // Высота от 10 до 110
                shapes.add(new Rectangle(randomColor, x, y, width, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        task1 randomShapesPanel = new task1();
        frame.add(randomShapesPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}