public class Collatz {   
/*The Collatz sequence starts with an integer n and repeatedly computes the next number in the sequence until it reaches 1. 
Given an integer value n the next number in the sequence is:
                - n/2 if n is even
                - 3n+1 if n is odd
Compute Collatz(5) = 16 -> 8 -> 4 -> 2 -> 1 */

    //recursive
    public static void rCollatz (int n ){
        
        StdOut.print(n + " ");
        //base case
        if (n==1){
            return; //reached the end of the sequence so theres nothing to be printed
        }

        //recursive case
        if(n%2==0){
            rCollatz(n/2);
        }else{
            rCollatz(3*n+1);
        }

    }

    public static int nextNumberInSequence (int n){

        if(n%2==0){
            return n/2;
        }else{
            return 3*n+1;
        }
    }

    public static void iCollatz (int n){

        StdOut.print(n + " ");

        while(n!=1){
            n = nextNumberInSequence(n);
            StdOut.print(n + " ");
        }
    }

    public static void main (String[] args){
        //this will be used to test our methods in collatz

        StdOut.print("Enter a number: ");
        int number = StdIn.readInt();
        rCollatz(number);
    }
}
