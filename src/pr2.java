
import java.util.Scanner;
public class pr2 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter distance");
        int distance=input.nextInt();
        System.out.println("Distance: "+distance);
        double fuel=(distance/100.0)*8.5;
        System.out.println("Fuel needed "+fuel );
        System.out.println("Total cost of the trip :$"+fuel*12.5);

    } }