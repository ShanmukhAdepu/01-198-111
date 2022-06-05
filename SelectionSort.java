public class SelectionSort {
    public static void main (String[] args){

        char[] a = {'c', 'q', 'r', 'b', 'p', 'd', 'x'};

        int itr = 1;

        int n = a.length;
        for(int i = 0; i < n; i++){
            int count  = 0;
            int min = i;
            for(int j = i+1; j < n; j++){
                count++;
                if(a[j] < a[min]){

                    min = j;
                    
                }
                
            }
            exchange(a, i, min);

            
            System.out.println("Iteration: " + itr );
            System.out.println("# of Comparisons is: " + count);
            itr++; 
            //prints the updated array
            for(int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
        }

        

        
    }
    private static void exchange(char[] a, int i , int j ){
        //exchange the value at index i with the value at index j
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
