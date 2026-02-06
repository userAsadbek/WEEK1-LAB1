import java.util.Scanner;

public class pr7{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
       int password=1234;
       int attempt=0;
       while(attempt<3){
           System.out.println("Enter PIN");
           int pin=input.nextInt();
           if(pin==password) {
               System.out.println(pin+"--> ACCESS GRANTED");
           break;}
            else {
               System.out.println(pin+"--> Try again");
           }
           attempt++;}
        if (attempt == 3) {
            System.out.println("Account locked");
        }
       }
    }