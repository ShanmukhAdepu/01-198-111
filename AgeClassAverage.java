public class AgeClassAverage {

    public static void main (String[] args){

        int agesSum=0;
        int numberOfPeople=0;

        // read until the standard input is empty
        // StdIn.isEmpty() returns true if there is nothing tlse in the std input

        while ( !StdIn.isEmpty()){
            int age = StdIn.readInt();
            agesSum += age;
            numberOfPeople += 1;
            if (age>0){
                agesSum += age;
                numberOfPeople+= 1;

            }else{
            StdOut.println("Invalid Age: Age has to be positive");
            }
        }
        StdOut.println("There are " + numberOfPeople + "people.");
        StdOut.println("Their age average " + ((double)agesSum)/numberOfPeople);
        
    }
    
}
