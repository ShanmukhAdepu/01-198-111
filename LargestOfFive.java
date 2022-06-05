/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        int a3 = Integer.parseInt(args[2]);
        int a4 = Integer.parseInt(args[3]);
        int a5 = Integer.parseInt(args[4]);

        if (a1>a2 && a1>a3 && a1>a4 && a1>a5){
            System.out.println (a1);
        }
        else{
            if (a2>a1 && a2>a3 && a2>a4 && a2>a5){
                System.out.println (a2);
            }
            else{
                if (a3>a2 && a3>a1 && a3>a4 && a3>a5){
                    System.out.println (a3);
                }
                else{
                    if (a4>a2 && a4>a3 && a4>a1 && a4>a5){
                        System.out.println (a4);
                    }
                    else{
                        if (a5>a2 && a5>a3 && a5>a4 && a5>a1){
                            System.out.println (a5);
                        }   
                    }   
                }   
            }
        }

    }
}