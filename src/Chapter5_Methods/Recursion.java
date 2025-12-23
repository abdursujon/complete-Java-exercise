package Chapter5_Methods;

public class Recursion {
    // Recursion is the process of defining something in terms of itself.
    // Below is an example of a method calling itself

    //Write a recursion method to find factorial of a number
    int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result =fact(n-1) * n;
        return result;
    }

    //Write a recursive function that computes the sum of digits of a positive integer n.
    int sumDigit(int n){
        if(n == 0)
            return 0;
        return (n%10) + sumDigit(n/10);
    }

    //Write a recursive function that counts how many times a digit d appears in a non-negative integer n.
    int countNum(int n, int d){
        if(n == 0)
            return d == 0 ? 1:0; // if d == 0 return 1, otherwise 0;
        return ((n % 10 == d)? 1:0 ) + countNum(n/10,d);
    }

    // Write a recursive function that reverses a non-negative integer n.
    int reverseNum (int n){
        return reverseRecursion(n,0);
    }

    int reverseRecursion(int n, int rev){
        if(n == 0)
            return rev;
        return reverseRecursion(n/10, rev * 10 + n % 10);
    }

    public static void main (String [] args){
        Recursion recursion = new Recursion();

        // Test the factorial method
        System.out.println(recursion.fact(5));
        System.out.println(recursion.fact(1));

        // Test teh sumDigit method
        System.out.println(recursion.sumDigit(729));

        // Test the countNum method
        System.out.println(recursion.countNum(900099, 9));

        // Test reverse number
        System.out.println(recursion.reverseNum(9767));
    }

}
