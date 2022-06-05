public class Equals {
    public static void main(String[] args){
        //takes 3 integer command-line arguments as input and displays true if the 3 inputs are equal, false otherwise. 
        //Write your program using only Boolean expressions, do not use if{} or if{}else{} statements.

        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        int a3 = Integer.parseInt(args[2]);

        boolean check1 = a1 == a2;
        boolean check2 = a2 == a3;
        boolean check3 = a1 == a3;
        
        boolean fcheck1 = check1 && check2;
        boolean fcheck2 = check2 && check3;

        boolean finalCheck = fcheck1 && fcheck2;

        System.out.println(finalCheck);

    }
}
