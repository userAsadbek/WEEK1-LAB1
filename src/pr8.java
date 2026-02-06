import java.util.Scanner;

public class pr8{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current population");
       double people=input.nextInt();
       int twice=(int)people*2;
        int year=0;
       while(people<twice){
           people=people*1.05;
           System.out.printf("Year  "+(year+1)+": %.2f%n ",+people);
           year++;
       }
        System.out.println("It will take "+year+" years to double.");
    }}