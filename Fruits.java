public class Fruits {
    
    public static void main (String[] args){

        // 2d array of fruits ([row][column])
        // [0][0]strawberry  [0][1]apple      [0][2]cherry     [0][3]tomato (1st row)
        // [1][0]mango       [1][1]orange     [1][2]tangerine  [1][3]melon     [1][4]papaya (2nd row)
        // [2][0]kiwi        [2][1]avacado    [2][2]grape      [2][3]pear      [2][4]lime     [2][5]guava (3rd row)
        String[][] fruits = {{"strawberry", "apple", "cherry", "tomato"},{"mango", "orange", "tangerine", "melon", "papaya"},{"kiwi", "avocado", "grape", "pear", "lime", "guava"}};

        for(int r =0; r<fruits.length; r++){ // goes through each row
            for (int c =0; c<fruits[r].length; c++){ // goea through each column
                System.out.print(fruits[r][c] + " "); // prints what is shown above but without the [][]
            }
            System.out.println(" "); // prints new line
        }
    }
}
