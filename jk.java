public class jk {
   
    public static void main(String[] args){

    StdOut.println("Give a value for n: ");
    int n = StdIn.readInt();
    int [] [] array = new int [n][n];

    int f = n*n;
    int ma = 1;

    StdOut.println("Give values for this " + n + "x" + n + " 2Darray: ");
    int a = StdIn.readInt(args[i]);

    for (int row = 0; row < array.length; row++){
        for (int col = 0; col < array[row].length; col++){ 
            int checker = a;
            i++;
            array[row][col]= checker;
        }
    }

    }
}
