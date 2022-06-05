/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int numr = Integer.parseInt(args[0]);
		int numc = Integer.parseInt(args[1]);

		int[] [] rotten = new int[numr] [numc];
		int i = 2;
		for (int row = 0; row < rotten.length; row++){
			for (int col = 0; col < rotten[row].length; col++){ 
				int checker = Integer.parseInt(args[i]);
				i++;
				rotten[row][col]= checker;
			}
		}

		double[] sumArr= new double[numc];
		for(int k = 0; k < numc; k++){
			double sum = 0;
			for (int j = 0; j < numr; j++){
				sum+=rotten[j][k];
			}
			sumArr[k] = sum;
		}

		int ret = -1;
		double max = 0;
		for(int s = 0; s < numc; s++){
			if(sumArr[s]>=max){
				max=sumArr[s];
				ret=s;
			}
		}
		System.out.println(ret);
	}
}
