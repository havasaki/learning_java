package lab15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1 {
    private JTextArea textArea;

    public task1() {
        // Создаем фрейм
        JFrame frame = new JFrame("Пример меню");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Создаем текстовое поле
        textArea = new JTextArea();
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создаем панель для кнопок
        JPanel buttonPanel = new JPanel();

        // Создаем кнопки
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");

        // Обработчики для кнопок
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button1 был нажат");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button2 был нажат");
            }
        });

        // Добавляем кнопки на панель
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Добавляем панель кнопок на основную панель
        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(panel);

        // Создаем меню
        JMenuBar menuBar = new JMenuBar();

        // Меню "Файл"
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");

        exitItem.addActionListener(e -> System.exit(0));
        saveItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Функция сохранения еще не реализована."));

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        // Меню "Правка"
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");

        copyItem.addActionListener(e -> textArea.copy());
        cutItem.addActionListener(e -> textArea.cut());
        pasteItem.addActionListener(e -> textArea.paste());

        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        menuBar.add(editMenu);

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Справка");
        JMenuItem aboutItem = new JMenuItem("О программе");

        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Это пример приложения с меню в Java."));
        helpMenu.add(aboutItem);
        menuBar.add(helpMenu);

        // Устанавливаем меню в фрейм
        frame.setJMenuBar(menuBar);

        // Отображаем фрейм
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(task1::new);
    }
}