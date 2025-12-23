package Chapter4_Class;

public class NestedClassOuter {
    int outer_x = 100;

    void test(){
        NestedInnerClass nestedInnerClass = new NestedInnerClass();
        nestedInnerClass.display();
    }

    class NestedInnerClass{
        void display(){
            System.out.println("Display: outer_x = " + outer_x);
        }
    }

    public static void main(String [] args){
        NestedClassOuter nestedOuterClass = new  NestedClassOuter();
        nestedOuterClass.test();
    }
}
