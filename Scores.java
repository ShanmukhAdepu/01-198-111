public class Scores {

    public static void main (String[] args){

        double[] [] scores = new double[3] [4]; // declares the 2D array of 3 rows(students) and 4 columns (quizzes)

        //populates the array randomly
        //scores.length is the number of rows (students)
        for (int s =0; s < scores.length; s++){

            //populates each row s
            // scores[a].length is the number of columns in row s
            for ( int q = 0; q < scores[s].length; q++){

                scores[s][q] = Math.random() * 10; //math.random() gives a value between 0 and 1 but multiplying by 10 gives a value between 0 and 10
                System.out.println("[" + s + "]" + "[" + q + "] = " + scores [s][q]);
            }
        }
        for (int s = 0; s < scores.length; s++){
        //average all the quizzes for students at index 0
        //go to row at index 0 and traverse all columns summing it all up
            double quizSum = 0.0;
        
            for(int q = 0; q<scores[s].length; q++){
            
                quizSum += scores[s][q];
        }
        System.out.println("Average of quizzes for student " + s + " = " + quizSum/scores[s].length);
    }
    
    //int quiz = 0; // quiz index that we want to average
    for (int q=0; q<scores[0].length; q++){ // iterating over the columns
        double sum = 0; // summing variable for one quiz
        for (int s=0; s<scores.length; s++){
            sum += scores[s][q];

        }
        System.out.println("Average for quiz " + q + " = " + sum/scores.length);
        }
    }
}
