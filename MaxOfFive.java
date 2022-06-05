public class MaxOfFive {

    public static void main(String[] args){

        int max = 0;
        int count = 0;
        while (count<5){
            StdOut.print("Enter a positive integer; ");
            int number = StdIn.readInt(); // program stops and waits for a user inputted integer

            if (number>0){
                count += 1;
                if (number>max){
                    max = number;
                }
            }else{
                StdOut.println("Invalid Number: Please enter a positive value");

            }
        }
        StdOut.println("The maximum value is " + max);
    }
    
}
