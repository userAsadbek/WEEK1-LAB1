import java.util.Scanner;
public class pr8 {  static void main(String []args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter integer");
    int n=input.nextInt();
    int reverse=0;
    while(n>0) {
       reverse=reverse*10+n%10;
        n/=10;
    }
    System.out.println("REVERSE IS "+reverse);
}}