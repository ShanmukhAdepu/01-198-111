public class Factorial {
    
    //iterative factorial
    public static int iFactorial (int n){

        int result = 1;
        for(int i = n; i > 1; i--){
            result = result * i;
        }
        return result;
    }

    //recursive factorial
    public static int rFactorial (int n ){

        //Always write the base case first
        //base case
        if (n == 1){
            return 1;
        }
        int r = n * rFactorial(n-1);
        return r;
    }
}
