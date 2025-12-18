public class Variables {
    int a, b, c; // declares three variables at once
    int d=3, e,f=5;
    byte z = 22;
    double pi =3.14159;
    char x ='x';

    public static void main(String[] args) {
        // Dynamic initialisation
        double ab = 3.0, bc = 4.0;
        double cd = Math.sqrt(ab*ab+bc*bc);
        System.out.println(cd);
    }
}
