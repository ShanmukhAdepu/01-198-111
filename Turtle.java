import java.awt.Color;

public class Turtle {
    
    //Abstract Data Type (ADT) Turtle

    /*****The instance of a class is an object*****/

    //Instance variables have unique values to each object (Instance of the class)
    //Private modifier hides the instance variable from other classes
    //(x, y) coordinate
    private double x;
    private double y;

    //direction in which the turtle is facing
    private double angle;

    //turtle color
    private Color color;

    /*****Constructors *****/
    //Constructors have the name of the same name of the class
    //Constructors create and initialize the object (initializing the instance variables)

    //Default constructor: no argument constructor
    public Turtle () {
        x = y = 0.0;
        angle = 90.0;
        color = new Color(0,0,0); //black color
    }

    //4 argument constructor
    public Turtle(double x, double y, double angle, Color color){
        this.x = x; //changes the private variable of x to the function x
        this.y = y;
        this.angle = angle;
        this.color = color;
    }

    //Instance methods of the class Turtle
    //Instance methods DO NOT HAVE THE WORD static
    //Instance methods manipulate (have access) to instance variables

    //toString() method returns the string representation of an object
    public String toString(){
        return "Turtle (" + x + ", " + y +") direction " + angle + " " + color.toString();
    }

    //turn left by updating the turtle angle
    public void turnLeft (double delta){
        angle += delta;
    }

    //mpves the turtle forward by anumber of steps
    //draw a line from the old (x,y) to the new (x,y)
    public void moveForward (double steps){
        double oldx = x;
        double oldy = y;

        x += steps * Math.cos(Math.toRadians(angle));
        y += steps * Math.sin(Math.toRadians(angle));

        StdDraw.setPenColor(color);
        StdDraw.line(oldx, oldy, x, y);
    }

    //accessor methods
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getAngle(){
        return angle;
    }
    public Color getColor(){
        return color;
    }
    public void setColor (Color color){
        //update the turtle color
        this.color = color;
    }

    //equals method to compare this object with another one
    //Object class  is a class in java, all classes are derived rfom Obect
    public boolean equals (Object other){

        if(other instanceof Turtle){
            //other is of Turtle type
            Turtle o = (Turtle) other;
            return this.x == o.x && this.y == o.y && this.angle == o.angle && this.color.equals(o.color); //cannot compare colors like this; this.color == o.color
        }else{
            //other is not of Turtle type
            return false;
        }
    }

    //static methods do not have access to any instance variables or methods
    public static void main (String[] args){

        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle(0.5, 0.5, 45, new Color(0,255,0));

        StdOut.println(t1);
        StdOut.println(t2);
        StdOut.println(t1.equals(t2));

        t2.moveForward(0.1);
        StdOut.println(t2);
    }
}
