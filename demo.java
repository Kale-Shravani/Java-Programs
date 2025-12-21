import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int num1=input.nextInt();
        System.out.println("Enter second Number:");
        int num2=input.nextInt();
        System.out.println("Enter Choice:\n1.Addtion\n2.Substraction\n3.Multiplication\n4.Division");
        int Choice=input.nextInt();
        switch(Choice){
            case 1:
            System.out.println("addition of two number is:"+(num1+num2));
            break;
            case 2:
            System.out.println("substraction of two number is:"+(num1-num2));
            break;
            case 3:
            System.out.println("multiplication of two number is:"+(num1*num2));
            break;
            case 4:
            if(num2!=0){
                System.out.println("division of two number is:"+(num1/num2));
            }else{
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
        input.close();
    }    
}
