public class DrawingShapes {

    public static void main(String[] args){

        StdDraw.square(0.2, 0.8, 0.1); //draws square (x, y, size)
        StdDraw.filledSquare(0.8, 0.8, 0.2); //draws filled square (x, y, size)
        StdDraw.circle(0.8, 0.2, 0.2); //draws circle (x, y, radius)

        double[] xd = {0.1, 0.2, 0.3, 0.2}; //x-coordingates of polygon
        double[] yd = {0.2, 0.3, 0.2, 0.1}; //y-coordinates of polygon
        //{0.1, 0.3}, {0.2, 0.3}, {0.3, 0.2}, {0.2, 0.1}

        StdDraw.filledPolygon (xd, yd); //draws filled polygon
        StdDraw.setPenColor(StdDraw.WHITE); //sets pen color to white
        StdDraw.text(0.8, 0.8, "White text"); //sets location of text and the text that is going to be inputted there

    }
    
}
