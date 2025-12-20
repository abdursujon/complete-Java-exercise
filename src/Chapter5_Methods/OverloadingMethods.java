package Chapter5_Methods;

import Chapter4_Class.Box;

public class OverloadingMethods {
    void test(){
        System.out.println("No parameters");
    }

    void test(int a){
        System.out.println("a is " + a);
    }

    public static void main(String [] args){
        OverloadingMethods ob = new OverloadingMethods();
        ob.test();
        ob.test(5);
    }
}
