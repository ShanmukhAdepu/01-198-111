import java.awt.Color;

public class DrunkenTurtles {
    
    public static void main (String[] args){

        int numberOfTurtles = Integer.parseInt(args[0]);
        int numberOfSteps = Integer.parseInt(args[1]);
        double stepSize = Double.parseDouble(args[2]);

        //allocate enough space for numberOfTurtles
        Turtle[] turtles = new Turtle[numberOfTurtles]; //using an array to allocate this space
        
        //intantiate the turtles, each turtle is one object
        for(int i = 0; i< turtles.length; i++){
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            //color is R G B
            Color c = new Color(StdRandom.uniform(256), StdRandom.uniform(256), StdRandom.uniform(256));
            turtles[i] = new Turtle(x, y, 0.0, c); //creating an object of type Turtle
        }

        StdOut.println("Number of Turtles " + numberOfTurtles); 

        //make each turtle take one step at a time for a total of numberOfSteps
        
        for(int s = 0; s < numberOfSteps; s++){
        
            //all turtles take on step
            for(int i = 0; i < turtles.length; i++){
                double delta = StdRandom.uniform(0.0, 360.0); //the angle that the turtle will turn left by
                turtles[i].turnLeft(delta);
                turtles[i].moveForward(stepSize);
            }
        }

    }
}
