package lab3;
import java.util.Random;
public class task1 {
    public static void main(String[] args){
        Random rd = new Random();
        int arr[] = new int[4];
        for (int i=0; i<arr.length;i++){
            arr[i]=10+rd.nextInt(90);
            System.out.print(arr[i]+ " ");
        }
        boolean isIncreasing=true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                isIncreasing=false;
                break;
            }
        }
        if (isIncreasing){
            System.out.println("Массив является строго возрастающей последовательностью.");
        }
        else{
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
