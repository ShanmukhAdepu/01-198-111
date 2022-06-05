public class StringTest {
    
    //will return the amount of times char c appears in a string(str)
    public static int letterCount (String str, char c){

        int counter = 0;
        String strLowerCase = str.toLowerCase();
        char cLowerCase = Character.toLowerCase(c);

        for(int i = 0; i<strLowerCase.length(); i++){
            char ch = strLowerCase.charAt(i); //retrieves the character at index i from the string strLowerCase
            if (ch == cLowerCase){
                counter +=1;
            }
        }
        return counter;
    }
    
    public static void main (String[] args){

        StdOut.println(letterCount("Sleeping Cat", 'e')); //e is in single quotes since its a character
        StdOut.println(letterCount("Sleeping Cat", 'h'));
        StdOut.println(letterCount("Sleeping Cat", 's'));
    }
}
