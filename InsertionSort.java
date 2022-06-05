public class InsertionSort {
    
    public static void main(String[] args){

        char[] a = {'C', 'Q', 'R', 'B', 'P', 'D', 'X'};

        
        int itr = 0;

        int n = a.length;
        for(int i = 1; i < n; i++){

            int count = 0;
            itr++;

            for (int j = i; j > 0; j--){
                count++;
                if(a[j-1] > a[j]){
                    exchange (a, j-1, j);
                    
                }else{
                    break;
                }
            }
            System.out.println("Iteration #" + itr);
            System.out.println(count + " Comparisons");
            for(int b = 0; b < n; b++){
                System.out.print(a[b] + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
            
            
        }
        
    }

    private static void exchange (char[] a, int i, int j){
        //exchange the value at index i with the value at index j
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
