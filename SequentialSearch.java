public class SequentialSearch {
    
    public static void main(String[] args){

        char[] a = {'c', 'q', 'r', 'b', 'p', 'd', 'x'};

        int count  = 0;

        char target = 'd';

        for(int i = 0; i < a.length; i++){

            count++;

            if(a[i] == target){

                System.out.println("Count is: " + count);
                System.out.println("Done");

            }

        }
    }
}
