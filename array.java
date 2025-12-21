import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];
        System.out.println("enter the array elements:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("array Elements are:");
        for(int ele:numbers){
            System.out.println(ele);
        }
        sc.close();
    }
}
