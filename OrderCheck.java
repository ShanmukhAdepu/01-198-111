/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author:
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {
        
        int w = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int z = Integer.parseInt(args[3]);

        boolean test11 = w < x; // tests for integer w being less than integer x
        boolean test12 = x < y; // tests for integer x being less than integer y 
        boolean test13 = y < z; // tests for integer y being less than integer z

        boolean test21 = w > x; // tests for integer w being greater than integer x
        boolean test22 = x > y; // tests for integer x being greater than integer y
        boolean test23 = y > z; // tests for integer y being greater than integer z 

        boolean halftest1 = test11 && test12; // tests to see whether w<x is TRUE and x<y is TRUE
        boolean half2test1 = test12 && test13; // tests to see whether x<y is TRUE and y<z is TRUE
        boolean test1 = halftest1 && half2test1; 

        boolean halftest21 = test21 && test22;
        boolean half2test21 = test22 && test23;
        boolean test2 = halftest21 && half2test21;

        boolean finalTest = test1||test2;

        System.out.println(finalTest);

	
	
    }
}
