/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

    int step = Integer.parseInt(args[0]); //takes in command line number of steps
    System.out.println("(0,0)"); //prints out the origin point
    int x = 0; //initializes and declares x
    int y = 0; //initializes and declares y
    double finalx = 0; //initializes and declares finalx
    double finaly = 0; //initializes and declares finaly
    double fin = 0; //initializes and declares fin
    for (int i = 0; i < (step+1); i++){ //this for loop keeps going until i is equal to step
        double rando = Math.random(); //this creates a random number in the range [0,1] every time the loop is iterated
        if (i == step){ //this checks to see if the last step has been completed or not
            finalx = x*x; //this squares x and converts it to a double
            finaly = y*y; //this squares y and converts it to a double
            fin = finalx + finaly; //this gives the square distance
            System.out.println("Squared distance = "+ fin); //this prints the square distance
        }else{ //if the last step has not been completed then this code block occurs
            if(rando<0.25 && rando>=0){ //this is the first 1/4 of 1
            x+=1; //this adds a value to x and sets x to this new value
            }else{
                if(rando<0.5 && rando>=0.25){ //this is the second 1/4 of1
                    x-=1; //this subtracts a value to x and sets x to this new value
                }else{
                    if(rando<0.75 && rando>=0.5){ //this is the third 1/4 of1
                        y+=1; //this adds a value to y and sets y to this new value
                    }else{
                        if(rando<=1 && rando>=0.75){ //this is the fourth 1/4 of1
                        y-=1; //this subtracts a value to y and sets y to this new value
                        }
                    } 
                }
            }
        System.out.println("(" + x + "," + y + ")");   //this prints out the coordinates each time the for loop runs and the last step has not been completed
        }     
    }
    }
    
}
