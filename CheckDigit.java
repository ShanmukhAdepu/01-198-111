/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main(String[] args) {

        long a1 = Long.parseLong(args[0]);

        long totalEven = 0;
        long totalOdd = 0;
        long totalSum = 0;

        while (a1 != 0){
            long digit1 = a1%10;
            a1 = a1/10;
            totalOdd = digit1 + totalOdd;
            long digit2 = a1%10;
            a1 = a1/10;
            totalEven = digit2 + totalEven;
            
        }

        totalOdd = totalOdd%10;
        totalEven = totalEven%10;
        totalEven = totalEven*3;
        totalEven = totalEven%10;
        totalSum = totalEven + totalOdd;
        totalSum = totalSum%10;

        System.out.println(totalSum);


        


    }
}