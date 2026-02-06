import java.util.Scanner;

public class pr1 {
    public static void main(String [] args){
      Scanner input=new Scanner(System.in);
        System.out.println(" Enter quantity of capuccinos(4.5$ each");
        System.out.println("and muffins price $3.00 each");
        int n=input.nextInt();
        int n1=input.nextInt();
       double total=(n*4.5+n1*3)*1.08+5.0;
        System.out.printf("Grand Total: $ %.2f" ,total);
   }

}
