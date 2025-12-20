package Chapter5_Methods;

public class ObjectAsParameter {
    int a, b;

    ObjectAsParameter(int i, int j){
        a = i;
        b = j;
    }

    boolean equalTo (ObjectAsParameter op){
        if(op.a == a && op.b ==b) return true;
        else return false;
    }

    public static void main(String [] args){
        ObjectAsParameter ob1 = new ObjectAsParameter(100, 22);
        ObjectAsParameter ob2 = new ObjectAsParameter(100, 22);
        ObjectAsParameter ob3 = new ObjectAsParameter(10, 2);
        System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
        System.out.println("ob2 == ob3 " + ob1.equalTo(ob3));
    }

    // Start from 225
}
