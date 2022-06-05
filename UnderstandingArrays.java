public class UnderstandingArrays {

    public static void main (String[] args){

        int[] varArray; // the [] denotes an array that can only hold integers
                        // declares a reference to an array
        varArray = new int[10]; // new creates a new piece of memory
                                // the 10 represents how many integers are needed (starting at 0-going to 9)
                                // this statement creates an array
                                // varArray is a reference to the array
        varArray[0] = 56; // index 0 is the first position of the array and has been set to 56
        varArray[1] = 78; // index 1 is the second position of the array and has been set to 78

        double[] doubleArray = new double[3000]; // declaring and creating an array with doubles
        doubleArray[50] = 4.3;

        char[] charArray = {'L','o','v','e'}; // declares and establishes values for a char array
        System.out.println("Size of charArray is " + charArray.length); // lets you know how many items are in the array

        for (int i = 0; i < charArray.length; i++){ 
            System.out.println(charArray[i]);
        }


    }
}
