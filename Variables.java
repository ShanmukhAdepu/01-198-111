public class Variables {
    
    public static void main (String[] args) {
        
        //Data Types
        //Build in: primitive data types (int(integers), double(specific numbers), char(characters), boolean(true or false test)), String
        
        int x; //declaration of a variable
        x=342;

        System.out.println(x);

        int y =20; //both declares and initializes y in the same line
        int z =15;
        int t =3;

        int divYByT = y/t; //divYByT is an example of Camel Case
                           // integer division: int/int=int
        System.out.println(divYByT);

        double doubleDivYByT = (y*1.0)/t;
        System.out.println(doubleDivYByT);

        char u; // declaration of a variable of type char
        u ='Y'; // a character is between single quotes

        String variableString = "This is a string";

        int remainder = y % t; // modulus(%)
        System.out.println("The remainder is " + remainder);

        double floor = Math.floor(doubleDivYByT);
        double ceil = Math.ceil(doubleDivYByT);
        System.out.println(floor + " " + ceil);
        System.out.println(Math.pow(z, t)); // power of z^t

        //floating point error, careful when comaprison doubles == (equals) != (not equals)
        double value1 = 0.6;
        double value2 = 0.2;
        double value3 = 0.2;

        double result1 = value1 - value2;
        double result2 = value2 + value3;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        //boolean is either true or false
        boolean resultComparison = result1 == result2;
        System.out.println("resultComparison = " + resultComparison);

        //test boolean
        boolean a = false;
        boolean nota = !a; // negation of the variable a !a, ! not operator
        System.out.println("a=" + a + " nota=" + nota);

        boolean c = false;
        boolean d = a && c; // and operator, only true if both inputs are true
        boolean e = a || nota; // or operator, only false if both inputs are false
        System.out.println("a&&c = " + d + ", a||!a= " + e);
    }
}
