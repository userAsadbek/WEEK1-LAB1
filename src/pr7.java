import java.util.Scanner;
public class pr7 {  static void main(String []args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter integer");
    int n=input.nextInt();
    int digits=0;
    while(n>0) {
    n/=10;
    digits++;
    }
    System.out.println(" DIGITS "+digits);
}}
