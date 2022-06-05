/*************************************************************************
 *  Compilation:  javac HeartTransplant.java
 *  Execution:    java HeartTransplant < data.txt
 *
 *  @author:
 *
 *************************************************************************/

public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */
    
    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {
        
        // WRITE YOUR CODE HERE
        this.listOfPatients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     * 
     * Returns:  0 if successfully inserts p into array, 
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {

        //finds the size of the listOfPatients array
        int size = listOfPatients.length;

        //tests to see if space is available to add the new value p into the array
        if(size-1 <= arrayIndex){ //executed if space isn't available
            return -1;
        }else{ //nothing happens if space is unavailable
            for(int i = size-1; i>arrayIndex; i--){
                listOfPatients[i] = listOfPatients[i-1];
            }
            listOfPatients[arrayIndex] = p;
            return 0;
        }
    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     * 
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     * 
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {

        //Creates the listOfPatients array with numberOfLines length.
        listOfPatients = new Person[numberOfLines];

        int i;

        for(i = 0; i < numberOfLines && StdIn.hasNextLine(); i++){
            int id = StdIn.readInt();
            int ethnicity = StdIn.readInt();
            int gender = StdIn.readInt();
            int age = StdIn.readInt();
            int cause = StdIn.readInt();
            int urgency = StdIn.readInt();
            int stateOfHealth = StdIn.readInt();
            listOfPatients[i] = new Person(id, ethnicity, gender, age, cause, urgency, stateOfHealth);
        }
        return (i);

    }

    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     * 3) Inserts each rate from file into the survivabilityByAge array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {

        survivabilityByAge = new SurvivabilityByAge [numberOfLines];

        int i;

        for(i = 0; i < numberOfLines && StdIn.hasNextLine(); i++){  
            int age = StdIn.readInt();
            int years = StdIn.readInt();
            double rate = StdIn.readDouble();
            survivabilityByAge[i] = new SurvivabilityByAge (age, years, rate);
        }
        return (i);
    }

    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     * 3) Inserts each rate from file into the survivabilityByCause array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {

        //creates new array with numberOfLines size
        survivabilityByCause = new SurvivabilityByCause[numberOfLines];

        int i;

        for(i = 0; i < numberOfLines && StdIn.hasNextLine(); i++){
            int cause = StdIn.readInt();
            int years = StdIn.readInt();
            double rate = StdIn.readDouble();
            survivabilityByCause[i] = new SurvivabilityByCause(cause, years, rate);
        }
        return (i);
        
    }
    
    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has 
     * age above the parameter age from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     * 
     * Return null if there is no Person with age above the 
     * parameter age.
     */ 
    public Person[] getPatientsWithAgeAbove(int age) {

        //finds the amount of people over the given age
        int count = 0;
        for(int i = 0; i < listOfPatients.length; i++){
            if(listOfPatients[i].getAge() > age){
                count++;
            }
        }

        //sets Person array size or returns null if needed
        if (count == 0){
            return null;
        }

        Person[] patientsWithAgeAbove = new Person[count];
        

        int a = 0;
        for(int j = 0; j < listOfPatients.length; j++){
            if(listOfPatients[j].getAge() > age){
                patientsWithAgeAbove[a++] = listOfPatients[j];
            }
        }

        return patientsWithAgeAbove;
    }
    
    /*
     * Returns a Person array with every Person that has the state of health 
     * equal to the parameter state from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     * 
     * Return null if there is no Person with the state of health 
     * equal to the parameter state.
     */ 
    public Person[] getPatientsByStateOfHealth(int state) {

        //finds the amount of people with the given state of health
        int count = 0;
        for(int i = 0; i < listOfPatients.length; i++){
            if(listOfPatients[i].getStateOfHealth() == state){
                count++;
            }
        }

        //sets Person array size or returns null if needed
        if (count == 0){
            return null;
        }

        Person[] patientsByStateOfHealth = new Person[count];
    
        int a = 0;
        for(int j = 0; j < listOfPatients.length; j++){
            if(listOfPatients[j].getStateOfHealth() == state){
                patientsByStateOfHealth[a++] = listOfPatients[j];
            }
        }

        return patientsByStateOfHealth;
    }

    /*
     * Returns a Person array with every person that has the heart 
     * condition cause equal to the parameter cause from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Person with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Person[] getPatientsByHeartConditionCause(int cause) {

        //finds the amount of people with the given cause
        int count = 0;
        for(int i = 0; i < listOfPatients.length; i++){
            if(listOfPatients[i].getCause() == cause){
                count++;
            }
        }

        //sets Person array size or returns null if needed
        if (count == 0){
            return null;
        }

        Person[] patientsByHeartConditionCause = new Person[count];
    

        int a = 0;
        for(int j = 0; j < listOfPatients.length; j++){
            if(listOfPatients[j].getCause() == cause){
                patientsByHeartConditionCause[a++] = listOfPatients[j];
            }
        }

        return patientsByHeartConditionCause;
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     * 
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     * 
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     * 
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     * 
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */ 
    public Person[] match(int numberOfHearts) {

        Person[] people = new Person[numberOfHearts];

        if(numberOfHearts > listOfPatients.length){
            return listOfPatients;
        }else{
            for(int i = 0; i < numberOfHearts; i++){
                people[i] = listOfPatients[i];
            }
            return people;
        }
    }

    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " patients read from file.");
 
        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");

        // read survivability by heart condition cause from file        
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");

        // list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p);
        }

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate);
        }

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate);
        }

    }
}
