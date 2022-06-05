public class BinarySearch1 {
    
    public static void main(String[] args){

        int[] A = {15, 2, 8, 1, 17, 5};
        System.out.println(sequentialSearch(A, 2));

    }

    /*
    {1, 3, 5, 6, 12, 19, 20, 25, 28, 33}

    Binary Search Procedure:
    Search for 8
    while (lo <= hi){
        Define lo, hi, mid
        Determine new mid, hi, or lo
    }
    Trace:
    lo = 0; 
    hi = 9
    mid = (lo + hi)/2 = 4.5 = 4
    hi = mid -1 = 4-1 = 3
    mid = (lo + hi)/2 = 1.5 = 1
    lo = mid + 1 = 3
    mid = (lo + hi)/2 = 2.5 = 2
    lo = mid + 1 = 3
    mid = (lo + hi)/2 = 3
    lo = mid + 1 = 4
    TERMINATES bc lo > hi // 4 > 3
    */
}
