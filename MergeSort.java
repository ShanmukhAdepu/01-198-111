public class MergeSort {
    
    public static void main(String[] args){

        char[] a = {'C', 'Q', 'S', 'A', 'X', 'B', 'T'};

        mergesort(a, 0, 6);

        for(int c = 0; c<a.length; c++){
            System.out.print(a[c] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void mergesort(char[] a, int l, int r){

        if(l >= r){
            return;
        }

        int middle = (l+r)/2;

        mergesort(a, l, middle);
        mergesort(a, middle+1, r);
        merge(a, l, middle, r);

    }

    public static void merge (char[] a, int lo, int m, int hi){

        //copy lower half of the array into b
        char[] b = new char[m-lo+1];
        for (int i = 0; i <= m-lo; i++){
            b[i] = a[lo+i];
            
        }

        //copy upper half of the array into c
        char[] c = new char[hi-m];
        int ab = 0;
        for (int k = m+1; k <= hi; k++){
            c[ab] = a[k];
            ab++;
            
        }

        int i = 0;
        int j = m+1;
        int k = lo;

        int count = 0;

        while (i <= m-lo && j <= hi){
            count++;
            if(a[j] < b[i]){
                a[k] = a[j];
                k += 1;
                j += 1;
            } else {
                a[k] = b[i];
                k += 1;
                i += 1;
            }
        }

        while (i <= m-lo){
            a[k] = b[i];
            k += 1;
            i += 1;
        }

        while (j <= hi){
            a[k] = a[j];
            k+=1;
            j+=1;
        }

        
        System.out.print("Resulting Array on the Left: ");
        for(int t = 0; t<b.length; t++){
            System.out.print(b[t] + " ");
        }
        System.out.println(" ");
        System.out.print("Resulting Array on the Right: ");
        for(int g = 0; g<c.length; g++){
            System.out.print(c[g] + " ");
        }
        System.out.println(" ");

        System.out.println("# of Comparisons: " + count);
        System.out.println(" ");
        
        
        

       
        
    }
}
