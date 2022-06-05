public class CS111Library {
    
    //A library is a java file with functions inside

    //Method/function to compute the factorial of a number x
    //The method returns an integer
    public static int factorial (int x){

        int result = 1; //holds the factorial of number x 

        for (int i = 2; i <= x; i++){
            result *= i; // same as result=result*1
        }
        return result; //returning the value of result to the caller method
    }

    //computes the absolute value of a number
    public static double absolute (double number){

        if(number >= 0){
            //its a positive number
            return number;
        }else{
            //its negative
            return number * -1.0;
        }
    }

    //Finds the minimum values on an 1d double array
    public static double FindMinimum(double[] array){

        double min = array[0]; //1 operation
        for (int i = 1; i<array.length; i++){ //1+(m-1+1)+(m-1) operations: int i = 1 is one op, 1 < array.length is (m-1+1) ops, i++ is (m-1)ops 
            if(min > array[i]){ //1 operation
                //found a new minimum
                min = array[i]; //1 operation executed x times
            }
        }
        return min; //1 operation
        //total operations is 1+1+(m)+(m-1)+x+1 -> 3m+1+x
        //m=array.length
        //minimum number of operations is 3n+1
        //maximum number of operations is 1+3n+n-1=4n
    }

    //makes a copy of the integer array argument
    //returns a new array which is the copy of the argument array
    public static int[] copyArray (int[] copyFrom){

        int[] copyTo = new int[copyFrom.length]; //allocates memory space for the copyTo array

        //traverse every single item of copyfrom and copy into CopyTo
        for (int i = 0; i< copyFrom.length; i++){
            copyTo[i] = copyFrom[i];
        }

        //return the new array
        return copyTo;
    }

    //main method
    public static void main (String[] args){ //main method signature

        int fact = 4; //calling the factorial method
        System.out.println(fact);
        
        System.out.println(absolute(-89.3));
        System.out.println(absolute(127.2));

        double[] a = {7.3, 8.2, 835.1, 3.1, 1298.4, 12.5};
        StdOut.println(FindMinimum(a));
    }
}
