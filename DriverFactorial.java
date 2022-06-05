public class DriverFactorial {
 
    public static void main (String[] args){

        StdOut.print("Enter a number: ");
        int number = StdIn.readInt();
        int fact = Factorial.iFactorial(number);
        StdOut.println("IterativeFactorial: " + fact);

        fact = Factorial.rFactorial(number);
        StdOut.println("Recursive factorial: " + fact);
    }

}
