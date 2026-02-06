import java.util.Scanner;

     public class p4{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter age, and program will tell you price of ticket :");
        int given=input.nextInt();
        if(given<0) {System.out.println("Incorrect age");}
        if(given>=0 && given<13) {System.out.println("Ticket price: $7");}
        else if(given>=13 && given<18) {System.out.println("Ticket price: $10 ");}
        else if(given>=18 && given<65) {System.out.println("Ticket price: $15");}
        else{
            System.out.println("Ticket price : $10"); }

        } }