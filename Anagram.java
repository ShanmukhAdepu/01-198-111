public class Anagram {
    
    public static void main(String[] args){
        System.out.println(anagram("silent", "listen"));
    }

    public static boolean anagram(String word1, String word2){

        if(word1.length() != word2.length()){
            return false;
        }

        for(int i = 0; i < word1.length(); i++){
            char letter = word1.charAt(i);
            int index = word2.indexOf(letter);

            if(index == -1){
                return false;
            }else{
                String before = word2.substring(0, index);
                String after = word2.substring(index+1);
                word2 = before+after;
            }
        }
        return true;
    }
}
