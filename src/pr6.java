import java.util.Scanner;

public class pr6{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight program will tell you price to ship: ");
        double d= input.nextDouble();
       if(d<0){
           System.out.println("Wrong input");}
       if( d>0 &&d<=2){
           System.out.println("Shipping cost: $5.00");}
       else if(d>2 && d<=10) {
               System.out.println("Shipping cost: $10.00");}
       else  {
           double price=(d-10)*2.0;
           System.out.println("Shipping cost: $"+(10+price));
    } } }