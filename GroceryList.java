import java.util.ArrayList; //add import line to use Array list

public class GroceryList {
    
    //declared ArrayList list, invoked the constructor
    ArrayList<String> list = new ArrayList<String>();
    list.add("rice milk");
    list.add("oreos");
    list.add("mangoes");
    list.add("bread");
    list.add("oranges");
    list.add("cheese");

    list.add(2, "strawberry");
    list.add(6, "tiramisu");
    list.add("sushi");
    list.add("ice cream");

    for (int i = 0; i < list.size(); i++){
        StdOut.println(i + " - " + list.get(i));
    }
}
