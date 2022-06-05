/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:
 *
 * 
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {

        double smallest = Double.MAX_VALUE;
        double secondSmallest = Double.MAX_VALUE;
        
        for (int i = 0; i < args.length; i++){

            double num = Double.parseDouble(args[i]);

                if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
                
                }else
                    if (num < secondSmallest && num > smallest){
                        secondSmallest = num;
                           
                    }else 
                        if (num < secondSmallest && num == smallest){
                            secondSmallest = num;
                        }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);
        
    }
}
