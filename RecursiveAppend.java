/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

        String newS = original;
        if(n == 0){
            return newS;
        }else{
            return newS+appendNTimes(original, n-1);
            
        }
        
    }

    public static void main (String[] args) {

    String s = appendNTimes("cat", 4);
    System.out.println(s);
    }
}
