import static java.lang.Thread.interrupted;

public class ForLoop {
    public static void main (String [] args){
        int n;
        for(n=10; n>0; n--)
            System.out.println(n);

        // tick from 0 to 9 but skip 5
        for(n=0; n<10; n++){
            if(n==5)
                continue;
            System.out.println(n);
        }

        // check if a given number is prime
        int num =2;
        boolean isPrime;
        if(num<2) isPrime =false;
        else isPrime = true;
        for (int i = 2; i<=num/i; i++){
            if((num % i) == 0){
                isPrime =false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");

        //double initialization inside for loop with comma
        int a, b;
        for(a =1, b=4; a<b; a++, b--) {
            System.out.println(" a = " + a);
            System.out.println(" b = " + b);
        }



        // Parts of the for loop can be empty
        int i;
        i=0;
        boolean done =false;
        for( ; !done;){
            System.out.println(" i is " + i);
            if (i == 10) done = true;
            i++;
        }

        // For loop condition can have boolean expression
        boolean done2 = false;
        for(int i2 =1; !done2; i2++){
            if(interrupted()) done2 = true;
        }
    }
}
