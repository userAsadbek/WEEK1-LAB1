import java.util.Scanner;
public class pr5 {
    static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer");
        int n=input.nextInt();
        int sum=0;
        System.out.println(" Integer "+n);
       int i=1;
       while(i<=n){
           sum+=i*i;
           i++;
    }
        System.out.println("SUM="+sum);
}}
