public class WeatherFunctionTests {
    
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

    public static void main (String args[]){
        int forecast[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        System.out.println(lengthOfLongestSpell(forecast, 2));
        System.out.println(forecast.length);
    }

}
