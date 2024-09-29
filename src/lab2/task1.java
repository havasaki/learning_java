package lab2;

public class task1 {
    public static void main(String[] args){
         String[] array={"apple", "banana", "cherry", "date", "elderberry"};
         for(int i=0; i< array.length; i++){
             System.out.print(array[i]+" ");
         }
         int left=0;
         int right=array.length-1;
         while(left<right){
             String temp = array[left];
             array[left]=array[right];
             array[right]=temp;
             left++;
             right--;
         }
         System.out.println();
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
