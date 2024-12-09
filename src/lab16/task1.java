package lab16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public task1() {
        setTitle("Проверка пароля");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Имя пользователя:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField();

        JButton submitButton = new JButton("Проверить");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCredentials();
            }
        });

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(submitButton);
    }

    private void checkCredentials() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Здесь можно добавить логику проверки пароля
        if ("user".equals(username) && "password".equals(password)) {
            JOptionPane.showMessageDialog(this, "Доступ разрешен");
        } else {
            JOptionPane.showMessageDialog(this, "Неверное имя пользователя или пароль");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            task1 frame = new task1();
            frame.setVisible(true);
        });
    }
}
