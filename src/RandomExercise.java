

public class RandomExercise  {
    static void main(String[] args ) {

            //PROBLEM 2.
            //Math.random() , random in math library;
            // return double value  [0.0;1.0]
            // 0.0-inclusive and 1.0-exclusively
            // in java return 6 values in common after double so %.2f is needed
            // General formula below for random generator
            // (int)(Math.random()*(max-min+1)+min;
            // multiply 1.0 *51 that means 51 is exclusively

            //problem 2
           int r=(int)(Math.random()*10)+1;
           double circumference=2*Math.PI*r;
           double area=Math.PI*r*r;
           System.out.printf("Radius: %d , Circumference : %.2f, Area: %.2f%n",r,
           circumference,area);

           int sec=(int)(Math.random()*60);
        System.out.printf(" Sec: %d",sec);
         }
}

