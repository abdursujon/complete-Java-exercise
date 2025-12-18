public class Operators{
    public static void main (String [] args){

        //1. Arithmetic operators (+;-;*;/;% 5 of them)
        int a = 69; int b = 80;
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println(sum + " " + sub + " " + mul + " " + div + " " + mod);

        //2. Unary Operators (++,--) (two of them)
        int c = 8; int d = 894;
        System.out.println("Postincrement (Increment happens after ++ is implemented) " + (c++));
        System.out.println("Preincrement (bla bla) " + (++c));
        System.out.println("PostDecrement " + (d--));
        System.out.println("PreDecrement " + (--d));

        //3. Assignment Operator: Asigns value from right to left variables(+=;-=;*=;/=) four of them
        int n = 17;
        n += 3; // n = n + 3 (n became 20)
        System.out.println(n);
        n *= 5; // n = n * 5 ( n is now 100)
        System.out.println(n);
        n -=6;  // n = n - 6; (n is now 94)
        System.out.println(n);
        n /=2;  // n = n / 2  (n is now 47)
        System.out.println(n);

        // 4. Relational Operators (>; >=; <; <=; ==; !=) six of them
        int e = 21;
        int f = 22;
        int g = 23;
        System.out.println("e > f " + (e>f) +  "; e < f " + (e<f) +  "; e >= f " + (e>=f) +  "; e <= f " + (e <= f) +  "; f == g " + (f == g) +  "; f != g " + (f != g) ) ;

        // 5. Logical operators (&&; || ; !) three of them
        boolean x = true;
        boolean y = false;
        System.out.println("x && y " + (x && y));
        System.out.println("x || y " + (x || y));
        System.out.println("!y " + (!y));

        // 6. Ternary operators (? on of them)
        int h = 23; int i = 44; int j = 25; int resultMax; int resultMin;
        resultMax = ((h>i) ? (h>j) ? h : j : (i>j) ? i : j);
        System.out.println("Max of three numbers = " + resultMax );
        if(h>i){
            if(h>j){resultMax = h;}
            else {resultMax = j;}
        }
        else {
            if (i>j) {resultMax =i ;}
            else {resultMax = j;}
        }
        System.out.println("Max of three numbers = " + resultMax );
        resultMin = ((a<b) ? (a<c) ? a : c : (b<c) ? b : c);
        System.out.println(resultMin);
        int [] arr = {a, b, c};
        int min = arr [0];
        for(int count  = 1; count<3; count++){
            if(arr[count] < min)
            {
                min = arr[count];
            }
        }
        System.out.println(min);

        //7. Bitwise operator
        Operators operator = new Operators();
        System.out.println(operator.bitwiseOperator());

        //8. Instanceof operator
        String str = "Hello I am Groot";
        System.out.println(str instanceof String);
        System.out.println(operator instanceof Operators);


    }

    //7. Bitwise operator method
    public static String bitwiseOperator(){
        int bitA= 0b1010;
        int bitB = 0b1100;
        // & AND ; | OR ; ^ XOR ; ~ NOT ; << Left shift ; >> Signed right shift ; >>> Unsigned right shift
        return "bitA & bitB =  " + (bitA & bitB)
                + "; bitA | bitB =  " + (bitA | bitB)
                + "; bitA ^ bitB =  " + (bitA ^  bitB)
                + "; ~bitA =  " + ~bitA
                + "; bitA << bitB =  " + (bitA << bitB)
                + "; bitA >> bitB =  " + (bitA >> bitB)
                + "; bitA >>> bitB =  " + (bitA >>> bitB) ;
    }
}
