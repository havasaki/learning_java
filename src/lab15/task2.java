package lab15;
import java.awt.*;
import java.awt.event.*;

public class task2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Калькулятор");

        // Поля для ввода чисел
        final TextField num1Field = new TextField();
        num1Field.setBounds(50, 50, 150, 20);

        final TextField num2Field = new TextField();
        num2Field.setBounds(50, 100, 150, 20);

        // Поле для отображения результата
        final TextField resultField = new TextField();
        resultField.setBounds(50, 150, 150, 20);
        resultField.setEditable(false); // Поле результата только для чтения

        // Кнопка для выполнения операций
        Button calculateButton = new Button("Посчитать");
        calculateButton.setBounds(50, 200, 100, 30);

        // Добавление обработчика события на кнопку
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    String result = "Результат: ";
                    result += "\nСложение: " + (num1 + num2);
                    result += "\nВычитание: " + (num1 - num2);
                    result += "\nУмножение: " + (num1 * num2);
                    result += "\nДеление: " + (num2 != 0 ? (num1 / num2) : "Деление на ноль");

                    resultField.setText(result);
                } catch (NumberFormatException exception) {
                    resultField.setText("Ошибка ввода!");
                }
            }
        });

        // Добавление элементов на фрейм
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(resultField);
        frame.add(calculateButton);

        // Настройка фрейма
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Закрытие фрейма
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}