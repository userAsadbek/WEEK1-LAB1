import java.util.Scanner;
public class pr6 {  static void main(String []args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter integer");
    int n=input.nextInt();
    int sum=1;
    int i=1;
    System.out.println(" Integer "+n);
    if(n==0){    System.out.println("FACTORIAL = 1 "); }
    else
        while(i<=n){
            sum*=i;
            i++;
        }

    System.out.println("FACTORIAL = "+sum);
}
}
