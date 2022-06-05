/*
 *
 * To generate weather for location at longitude -98.76 and latitude 26.70 for
 * the month of February do:
 * java WeatherGenerator -98.76 26.70 3
 * 
 * Remember that January is 2, February is 3 and so on.
 */
 

public class WeatherGenerator {

    static final int WET = 1; // Use this value for a wet day
    static final int DRY = 2; // Use this value for a dry day 
    
    // Number of days in each month, January is index 0, February is index 1
    static final int[] numberOfDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /*
     * Given a location (longitude, latitude) in the USA and a month of the year, the method
     * returns the forecast for the month based on the drywet and wetwet transition 
     * probabilities tables.
     * 
     * month will be a value between 2 and 13: 2 corresponds to January, 3 corresponds to February
     * and so on. These are the column indexes of each month in the transition probabilities tables.
     * 
     * The first day of the month has a 50% chance to be a wet day, 0-0.49 (wet), 0.50-0.99 (dry)
     * 
     * Use StdRandom.uniform() to generate a real number uniformly in [0,1)
     * 
     */
    public static int[] oneMonthGenerator(double longitude, double latitude, int month, double[][] drywet, double[][] wetwet) {

        //Double f = StdRandom.uniform(); //gives a random value for the first day
        int first = 0; //represents the first day
        int [] monthgen = new int[numberOfDaysInMonth[month-2]]; //array that is returned and filled with wet and dry days
        

        //this finds out whether the first day is wet or dry
        //if (f <= 0.49 && f >= 0){ 
           // first = WET; //1 represents a wet day
        //}else if (f >= 50 && f <= 0.99){
            //first = DRY; //2 represents a dry day
        //}

        //this gives the first day of the month a 1 or 2 based on whether it was a dry day or wet day
        //monthgen[0] = first;

        //this finds the row for the probability for the next day being wet given that today is wet
        int wet1 = 0;
        for(int w = 0; w < wetwet.length; w++){ //traverse through wetwet rows
            if (wetwet[w][0] == longitude && wetwet[w][1] == latitude){ //if these indexes equal the given longitude and latitude
                wet1 = w;
            }
        }

        //this finds the row for the probability for the next day being wet given that today is dry
        int dry1 = 0;
        for(int d = 0; d < drywet.length; d++){
            if (drywet[d][0] == longitude && drywet[d][1] == latitude){
                dry1 = d;
            }
        }

        //this populates the array with 1's and 2's for each day of the month following the first day
        for(int i = 0; i < monthgen.length; i++){
            Double x = StdRandom.uniform();
            if(i==0){
                if (x <= 0.49 && x >= 0.0){ 
                    first = WET; //1 represents a wet day
                    monthgen[i] = WET;
                }else{
                    if (x >= 0.50 && x <= 0.99){
                    first = DRY; //2 represents a dry day
                    monthgen[i] = DRY;
                    }
                }
            }else{
                if (first == WET){
                    if (x <= wetwet[wet1][month]){
                        monthgen[i] = WET;
                        first = WET;
                    }else{
                        monthgen[i] = DRY;
                        first = DRY;
                    }    
                }else{
                    if (x <= drywet[dry1][month]){
                        monthgen[i] = WET;
                        first = WET;
                    }else{
                        monthgen[i] = DRY;
                        first = DRY;
                    } 
                }
            }  
        }
        return monthgen;

    }

    /*
     * Returns the number of mode (WET or DRY) days in forecast.
     */ 
    public static int numberOfWetDryDays (int[] forecast, int mode) {

        int wetdry = 0;
        for(int i = 0; i < forecast.length; i++){
            if(forecast[i] == mode){
                wetdry ++;
            }
        }
        return wetdry;
    
    }

    /*
     * Returns the longest number of consecutive mode (WET or DRY) days in forecast.
     */ 
    public static int lengthOfLongestSpell (int[] forecast, int mode) {

        int ans = 0;
        int temp = 0;

        for(int i = 1; i < forecast.length; i++){    
            if (forecast[i] == mode && forecast[i-1] == mode){
                temp = temp + 1;
                if(temp>ans){
                    ans = temp; 
                }
            }else{
                temp = 0;           
            }
        }                
        return ans+1; 
    }

    /*
     * Reads numberOfLocations probabilites into arrayToFill.
     * 
     * Transition probabilities file format:
     * Longitude	Latitude	January	February	March	April	May	June	July	August	September	October	November	December 
     * -97.58	    26.02	    0.76	0.75	    0.77	0.74	0.80	0.86	0.94	0.97	0.89	0.77	0.74	0.77
     */ 
    public static void readTransitionProbabilities ( double[][] arrayToFill, int numberOfLocations ) {
        int row = 0;
        while (row < numberOfLocations) {
            arrayToFill[row][0] = StdIn.readDouble();  // Longitute
            arrayToFill[row][1] = StdIn.readDouble();  // Latitude
            arrayToFill[row][2] = StdIn.readDouble();  // January
            arrayToFill[row][3] = StdIn.readDouble();  // February
            arrayToFill[row][4] = StdIn.readDouble();  // March
            arrayToFill[row][5] = StdIn.readDouble();  // April
            arrayToFill[row][6] = StdIn.readDouble();  // May
            arrayToFill[row][7] = StdIn.readDouble();  // June
            arrayToFill[row][8] = StdIn.readDouble();  // July
            arrayToFill[row][9] = StdIn.readDouble();  // August
            arrayToFill[row][10] = StdIn.readDouble(); // Septmber
            arrayToFill[row][11] = StdIn.readDouble(); // October
            arrayToFill[row][12] = StdIn.readDouble(); // November
            arrayToFill[row][13] = StdIn.readDouble(); // December
            row += 1;
        }
    }

    /*
     *
     * Expects files in the same directory. The first (drywet.txt) contains
     * transition probabilities that reflects how often the weather changes
     * from wet to dry. The second (wetwet.txt) is transition probabilities
     * that reflects that the weather remains wet from one day to the next.
     * 
     */
    public static void populateTransitionProbabilitiesArrays(double[][] drywet, double[][] wetwet, int numberOfLocations) {

        // Read transition probabilities that reflects how often the weather
        // changes from wet to dry into 2D array drywet.
        // The first line on the file has number of locations (lines)
        StdIn.setFile("drywet.txt");
        readTransitionProbabilities(drywet, numberOfLocations);

        // Read transition probabilities that reflects that the weather remains 
        // wet from one day to the next into 2D array wetwet.
        // The first line on the file has number of locations (lines)
        StdIn.setFile("wetwet.txt");
        readTransitionProbabilities(wetwet, numberOfLocations);
    }

    /*
     *
     * Reads the files containing the transition probabilities for US locations.
     * 
     * To find 
     * 
     * Execution:
     *   java WeatherGenerator -97.58 26.02 3
     * 
     * 
     */

    public static void main (String[] args) {

        int numberOfRows    = 4001; // Total number of locations
        int numberOfColumns = 14;   // Total number of 14 columns in file 
                                    // File format: longitude, latitude, 12 months of transition probabilities
        
        // Allocate and populate arrays that hold the transition probabilities
        double[][] drywet = new double[numberOfRows][numberOfColumns];
        double[][] wetwet = new double[numberOfRows][numberOfColumns];
        populateTransitionProbabilitiesArrays(drywet, wetwet, numberOfRows);

        /*** WRITE YOUR CODE BELLOW THIS LINE. DO NOT erase any of the lines above. ***/

        // Read command line inputs 
        double longitude = Double.parseDouble(args[0]);
        double latitude  = Double.parseDouble(args[1]);
        int    month     = Integer.parseInt(args[2]);

        int[] forecast = oneMonthGenerator(longitude, latitude, month, drywet, wetwet);
        int drySpell = lengthOfLongestSpell(forecast, DRY);
        int wetSpell = lengthOfLongestSpell(forecast, WET);

        StdOut.println("There are " + forecast.length + " days in the forecast for month " + month);
        StdOut.println(drySpell + " days of dry spell.");

        for ( int i = 0; i < forecast.length; i++ ) {

            // This is the ternary operator. (conditional) ? executed if true : executed if false
            String weather = (forecast[i] == WET) ? "Wet" : "Dry";  
            StdOut.println("Day " + (i+1) + " is forecasted to be " + weather);
        }
    }
}