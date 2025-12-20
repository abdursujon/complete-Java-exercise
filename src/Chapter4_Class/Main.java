package Chapter4_Class;

public class Main {
    public static void main(String [] args){
        Box mybox = new Box();
        mybox.width = 100;
        mybox.height = 20;
        mybox.depth = 10;
        System.out.println(mybox.width);
        // When method is void, and it's printing something, println is not needed
        mybox.volume();
        // When using return method from another class, to print the result must use println
        System.out.println(mybox.boxColor());
        System.out.println(mybox.age(3));
    }
}
