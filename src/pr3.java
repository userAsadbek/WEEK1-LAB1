import java.util.Scanner;

public class pr3{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter seconds , i will tell you in h/m/s format");
        int given=input.nextInt();
        int hours=given/(60*60);
        given=given-hours*3600;
        int minutes=given/60;
        given=given-minutes*60;
        System.out.println(hours+" hours, "+minutes+" minutes,"+given+" seconds");


    }}