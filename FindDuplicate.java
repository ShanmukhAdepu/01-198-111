/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		String duplicates = "false";
		for(int i1 = 0; i1 < args.length; i1++){
			for (int i2 = i1+1; i2 < args.length; i2++){
				if (args[i1].equals(args[i2])){
					duplicates = "true";
				}
			}
		}
		System.out.println(duplicates);
	}
}
