public class calculatrice {
    public static double addition (double a, double b){
        return a+b;
    }
    public static double soustraction (double a, double b){
        return a-b;
    }
    public static double multiplication (double a, double b){
        return a*b;
    }
    public static double division (double a, double b){
        if(b==0){
            throw new ArithmeticException("can't devize by 0");
        }
        return a/b;
    }
}