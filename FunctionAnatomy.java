public class FunctionAnatomy {
    
    public static double sqrt(double c, double eps)//double is what type the returned value will come as
                                                   //sqrt is the method name
                                                   //(doublec, double eps) are the argument declarations
    {
        if (c < 0) return Double.NaN;
        double t = c;
        while (Math.abs(t-c/t) > eps*t)
            t = (c/t+t)/2.0;
        return t;
    }
}
