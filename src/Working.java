import java.util.Scanner;
public class Working {

    static void main(String []args ){
        System.out.println(" Enter hours ");
         Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Enter minutes");
        int m=input.nextInt();
         n=n%9+9;
        System.out.printf("Time is now %d : %d ",n,m);

    }
}
