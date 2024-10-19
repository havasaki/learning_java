package lab8;

public class task2 {
    public static void printNumbers(int n){
        if (n==1){
            System.out.print(1 + " ");
        }
        else{
            printNumbers(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args){
        printNumbers(10);
    }
}
