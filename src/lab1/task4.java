package lab1;
import java.util.Scanner;

public class task4 {
    public static long factorial(int number){
        long result=1;
        for (int i=1 ; i <= number; i++){
            result*=i;
        }
        return result;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        if (sc.hasNextInt()){
            int number = sc.nextInt();
            if (number<0){
                System.out.print("Факториал отрицательного числа не существует");
            }
            else{
                long result = factorial(number);
                System.out.println("Факториал числа " + number + " равен " + result);
            }
        }
        else{
            System.out.print("Вы ввели не целое число");
        }
    }
}
