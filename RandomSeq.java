public class RandomSeq {
    
    public static void main(String[] args){

        // read a number from the command line
        int n = Integer.parseInt(args[0]);

        //display n random values
        for (int i = 0; i < n; i++){
            System.out.println(Math.random());
        }
    }
}
