import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // int num;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a Number:");
        // num=sc.nextInt();
        for(int i=100;i<1000;i++){
            if(armstrong(i)){
                System.out.println(i+" ");
            }
        }
       // sc.close();
    }

    static boolean armstrong(int num){
        int n=num;
        int sum=0;while(n>0){
            int rem=n%10;
            n=n/10;
            int cube=rem*rem*rem;
            sum=sum+cube;
        }
        return sum==num;
    }
        
}
