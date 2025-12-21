import java.util.Scanner;
public class first{
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        int name=sc.nextInt();
        System.out.println("Name="+name);
        sc.close();
    }
}