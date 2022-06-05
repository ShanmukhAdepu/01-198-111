public class CopyArray {
    
    public static void main (String[] args){

        double[] array = new double[300]; // declaring and creating an double array

        // add random values
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random(); // puts random values within the array
        }

        double[] arrayCopy = new double[array.length];

        arrayCopy = array; // doesnt copy 

        //how do you truly copy?
        for (int i =0; i < array.length; i++){
            arrayCopy[i] = array[i];
        }
    }
}
