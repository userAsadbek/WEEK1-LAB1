import java.util.Scanner;
public class PROBLEM3 {

    //problem 3
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score ");
        int n = input.nextInt();
        if(n>100 || n<0){
            System.out.println("Wrong score");
        }
        else if (n <= 100 && n > 89) {
            System.out.println(" SCORE IS A");
        } else if (n < 90 && n > 79) {
            System.out.println("SCORE IS B");
        } else if (n > 69 && n < 80) {
            System.out.println("Score is C");
        } else if (n < 70 && n > 59) {
            System.out.println("Score is D");
        } else
            System.out.println("Score is F ");
    }
}