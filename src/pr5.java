import java.util.Scanner;

public class pr5{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year program will tell you it is leap or not : ");
        int given = input.nextInt();
        if(given%400==0){
            System.out.println(given +"-->Leap year");}
        else if(given%4==0 && given%100!=0){
            System.out.println(given+"-->Leap year");}
        else {
            System.out.println(given+ "--> Not a Leap year");
    } }}