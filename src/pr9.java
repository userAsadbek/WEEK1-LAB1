import java.util.Scanner;
public class pr9 {  public static void main(String []args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter integer");
    int n=input.nextInt();
    double sum=0.0;

   for( int i=0;i<n;i++){
    sum+=Math.pow(-1,i)/(2*i+1);
}
   sum*=4;
    System.out.println(" PI is "+sum);
}
}