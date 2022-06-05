public class 1DArrayMethods {
    public static void main(String[] args){
        int[] a = {12, 32, 60, 100};
        halve19a0;
        halve29a0;
    for(int i = 0; i < a.length; i++){
        System.out.print(a[i] + " ");
        }
    }
    public static int halve1(int x) {
        x = x/2;
        return x;
    }
    
    public static void halve2(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            halve1(a[i]);
            a[i] = halve1(a[i]);
        }
    }
    
    public static void halve3(int[] a) {
        int n = a.length;
        int[] b = new int[n/2];
        for(int i = 0; i < n/2; i++) {
            b[i] = a[i];
        }   
        a = b;
    }
    
}
