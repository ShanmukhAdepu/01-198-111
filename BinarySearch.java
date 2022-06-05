public class BinarySearch {
    
    public static void main (String[] args){

        char[] a = {'a', 'd', 'h', 'j', 'l', 'n', 'p', 'r', 'z'};

        char target = 'z';

        int left = 0;
        int right = a.length - 1;

        int count = 0;
        int itr = 0;

        while (left <= right){

            itr++;
            count = 0;

            int middle = (left + right) / 2;

            System.out.println("Iteration:" + itr);
            System.out.println("Left Side is:" + left);
            System.out.println("Right Side is:" + right);
            System.out.println("Middle is:" + middle);

            count++;
            if(a[middle] == target){
                System.out.println("# of Comparisons is:1");  
                System.out.println("Done!");
                System.out.println(" ");
                break;
               
            } else {
                count++;
                } if (target < a[middle]){
                    right = middle - 1;
            } else{
                left = middle + 1;
            }

            
            System.out.println("# of Comparisons is:" + count);
            System.out.println(" ");
        }
        
    }
}
