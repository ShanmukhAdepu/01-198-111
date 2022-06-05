public class ArrayRecursion {
    
    //returns the sum of items in an array starting at bIndex
    public static int sum (int[] array, int bIndex){

        StdOut.println("bIndex = " + bIndex + " array[bIndex] = " + array[bIndex]);
        //base case
        if(bIndex == array.length-1){
            //know we reached the last index of the array
            return array[bIndex]; //returns the last item
        }
        //recursive case
        return array[bIndex] + sum(array, bIndex+1);

    }

    public static void main (String[] args){

        int[] a = {83, 1, 45, 2, 23, 12, 3, 8, 4, 34};
        int sum = sum(a , 0);
        StdOut.println("Sum is " + sum);
    }
}
