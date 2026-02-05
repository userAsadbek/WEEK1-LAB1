import java.util.Scanner;
public class BodyIndex {
    static void main(String []args) {
        //PROBLEM 4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight");
        double w = input.nextDouble();
        System.out.println("Enter height and program will tell your Body Index");
        double h = input.nextDouble();
        double BMI = w / (h * h);
        if (BMI < 18.5)
            System.out.printf("Underweight %.2f",BMI);
       if(BMI>=18.5 && BMI<25)
           System.out.printf("Normal weight %.2f",BMI);
       if(BMI>=25 && BMI<30)
           System.out.printf("Overweight %.2f",BMI);
       if(BMI>=30)
           System.out.printf("Obese %.2f",BMI);
    }}