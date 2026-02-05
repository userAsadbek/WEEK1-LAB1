
public class Unspecificed {
    static void main(String[] args ) {


        //PROBLEM 1.
        System.out.println("Enter number in command i will tell you total");
        int sum=0;
        for(int i=0;i<args.length;i++){
              sum+=Integer.parseInt(args[i]); // string to int
     }
        System.out.println("Total "+sum);

    }
}
