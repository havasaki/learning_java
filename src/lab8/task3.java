package lab8;

public class task3 {
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        else{
            return n%10+sum(n/10); //последняя цифра + сумма оставшихся;
        }
    }
    public static void main(String[] args){
        int n=1234;
        System.out.println(sum(n));
    }
}
