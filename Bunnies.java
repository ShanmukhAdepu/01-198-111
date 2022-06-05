public class Bunnies {
    
    //returns the number of ears in a line of n bunnies
    //every even numbered bunny has 3 ears
    public static int earCount(int n){

        if(n==0){
            return 0; //base case
        }
        if(n%2==0){
            //3 ears
            return 3 + earCount(n-1);
        }else{
            //odd position
            return 2 + earCount(n-1);
        }
    }

    public static void main(String[] args){
        StdOut.print("Enter the number of bunnies in the line: ");
        int nbrBunnies = StdIn.readInt();
        StdOut.println(earCount(nbrBunnies) + " ears");
    }
}
