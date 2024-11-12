package lab11;
import java.util.Date;
import java.text.SimpleDateFormat;

public class task1 {

    public static void main(String[] args) throws InterruptedException {
        String developerLastName = "Иванов";

        Date dateReceived = new Date(); // Получаем текущее время
        System.out.println("Фамилия разработчика: " + developerLastName);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Дата и время получения задания: " + dateFormat.format(dateReceived));

        Thread.sleep(3000);

        // Дата и время сдачи задания
        Date dateSubmitted = new Date(); // Получаем текущее время снова
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(dateSubmitted));
    }
}