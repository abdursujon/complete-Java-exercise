package Chapter5_Methods;

public class StaticMethod {
    static int a;
    static int b;

    static void sumOfTwoNumber(int a, int b){
        System.out.println(a+b);
    }

    // Static method in same class can be access without creating and object of class
    public static void main (String [] args){
        StaticMethod.sumOfTwoNumber(55, 55);
    }
}
