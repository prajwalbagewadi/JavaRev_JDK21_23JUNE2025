
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter Elements in array:");
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter the Element:");
            numbers[i]=sc.nextInt();
        }
        System.out.println("Elements in Array:");
        for(int num : numbers){
            System.out.println("num:"+num);
        }
    }
}