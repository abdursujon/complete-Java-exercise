package Chapter5_Methods;

public class ControlStatement {
    //Default access in Java is package-private, can be only access in the same package, for example
    int a; // not specified what access control, therefore it's java default

    public int b; // public access
    private int c; // private access to only the class itself;

    // default access control for this method
    void printNum(int a){
        System.out.println(a);
    }

    // public control method
    public void printNum(int a, int b){
        System.out.println(a+b);
    }

    // Private control access
    private void printNum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    // protected access within same package, accesible in subclasses in sub pacakages
    // not accessible to non-subclasses
    protected int number;
    protected void printNum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    // Final keyword, perevents content from modified
    // It is a common coding convention to choose all uppercase identifiers for final fields
    final int FILE_NEW = 1;
    final int FILE_OPEN = 2;
    final int FILE_CLOSE = 3;

}
