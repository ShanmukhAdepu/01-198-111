public class PlotUSA {
    
    public static void main (String[] args){

        double ymin = StdIn.readDouble();
        double xmin = StdIn.readDouble();
        double ymax = StdIn.readDouble();
        double xmax = StdIn.readDouble();

        StdDraw.setXscale(xmin, xmax);
        StdDraw.setYscale(ymin, ymax);
        StdDraw.setPenColor(155, 45, 200);

        while ( !StdIn.isEmpty()){
            double y = StdIn.readDouble();
            double x = StdIn.readDouble();
            StdDraw.point(xmax-x+xmin,y);
        }
    }
}
//use Get-Content txtfilename | java javafilename in terminal to pull from a text file