public class ReverseArray {
    
    public static void main(String[] args){

        char[] today = {'T','o','d','a','y',' ','i','s',' ','s','u','n','n','y'};

        for( int i = 0; i < today.length/2; i++){ //goes from the beginning to the middle of the array

            char temp = today[i]; //saves today[i] // starts by saving t as a temproray variable 
            today[i] = today[today.length-1-i]; // swaps the item at index i with the item at index length - 1- i //swaps t with y
            today[today.length-1-i] = temp;  // swaps y with t which was stored as a temporary variable
        }

        for (int i = 0; i < today.length; i++){ //this loop is to print the reversed array

            System.out.print(today[i]);
        }

        System.out.println(); // starts a new line

        for (char itemValue : today){ // this is an enhanced for each loop
                                      //the itemValue is a character that is set to each character of the today array
            System.out.print(itemValue); //prints out each value of the today array 
        }
    }
}
