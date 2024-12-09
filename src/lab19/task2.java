package lab19;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

// Класс для представления студента
class Student {
    private String fio;
    private double averageGrade;

    public Student(String fio, double averageGrade) {
        this.fio = fio;
        this.averageGrade = averageGrade;
    }

    public String getFio() {
        return fio;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return fio + " - " + averageGrade;
    }
}

// Исключение для отсутствующего студента
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

// Интерфейс для операций со студентами
interface StudentOperations {
    void sortStudents();
    Student findStudentByFIO(String fio) throws StudentNotFoundException;
}

// Класс для управления списком студентов
class StudentManager implements StudentOperations {
    private Student[] students;

    public StudentManager(Student[] students) {
        this.students = students;
    }

    @Override
    public void sortStudents() {
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade())); // Сортировка по убыванию
    }

    @Override
    public Student findStudentByFIO(String fio) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFio().equalsIgnoreCase(fio)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО \"" + fio + "\" не найден.");
    }

    public Student[] getStudents() {
        return students;
    }
}

// Класс для пользовательского интерфейса
public class task2 {
    private StudentManager studentManager;

    public task2(StudentManager studentManager) {
        this.studentManager = studentManager;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Управление Студентами");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("Введите ФИО студента:");
        label.setBounds(10, 10, 150, 25);
        frame.add(label);

        JTextField fioField = new JTextField();
        fioField.setBounds(160, 10, 200, 25);
        frame.add(fioField);

        JButton searchButton = new JButton("Найти Студента");
        searchButton.setBounds(10, 45, 150, 25);
        frame.add(searchButton);

        JButton sortButton = new JButton("Сортировать Студентов");
        sortButton.setBounds(180, 45, 180, 25);
        frame.add(sortButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 80, 350, 150);
        resultArea.setEditable(false);
        frame.add(resultArea);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fio = fioField.getText();
                try {
                    Student student = studentManager.findStudentByFIO(fio);
                    resultArea.setText("Найден студент: " + student);
                } catch (StudentNotFoundException ex) {
                    resultArea.setText(ex.getMessage());
                }
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentManager.sortStudents();
                StringBuilder result = new StringBuilder("Студенты отсортированы:\n");
                for (Student student : studentManager.getStudents()) {
                    result.append(student).append("\n");

                }
                resultArea.setText(result.toString());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов И.И.", 4.5),
                new Student("Петров П.П.", 3.7),
                new Student("Сидоров С.С.", 4.9)
        };

        StudentManager studentManager = new StudentManager(students);
        new task2(studentManager);
    }
}
