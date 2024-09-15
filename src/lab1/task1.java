package lab1;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + avg);
    }
}