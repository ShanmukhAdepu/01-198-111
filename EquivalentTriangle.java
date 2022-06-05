public class EquivalentTriangle {

    public static void main (String[] args){

        //compute the height
        double h = ((Math.sqrt(3))/2)*1;

        StdDraw.line(0, 0, 1, 0); // (0,0) -> (0,1) base of triangle
        StdDraw.line(1, 0, 0.5, h); //one diagonal
        StdDraw.line(0.5, h, 0, 0);


    }
}
