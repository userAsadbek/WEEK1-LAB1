import java.util.Scanner;

public class pr10{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount");
        double deposit=input.nextDouble();
        System.out.println("Enter number of years");
        int year=input.nextInt();
        for(int i=0;i<year;i++){
        deposit=deposit*1.05;
            System.out.printf("Year "+(i+1)+": %.2f%n",deposit);
    } }  }