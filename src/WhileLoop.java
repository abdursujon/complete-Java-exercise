public class WhileLoop {
    public static void main (String [] args){
        // Count down 10 to 0
        int countNum =10;
        while(countNum>0){
            System.out.println("tick " + countNum);
            countNum --;
        }

        //print numbers 100 to 0 descending order
        int printNumbers = 100;
        while(printNumbers>0){
            System.out.println("Current number is " + printNumbers);
            printNumbers --;
        }

        // while with no-body to find mid-point between two numbers
        int i=100, j=200;
        while(++i < --j);
        System.out.println("Midpoint is " + i);

        // Question 1: i = 1 Print numbers 1 to 100 using while. Only multiples of 7.
        int printNumbersDevisibleBySeven = 1;
        while(printNumbersDevisibleBySeven<=100){
            if(printNumbersDevisibleBySeven % 7 == 0)
                System.out.println(printNumbersDevisibleBySeven);
                printNumbersDevisibleBySeven ++;
        }

        System.out.println();
        System.out.println();

         /* Question 2: number1 = 50 and number2 = 5
            Using while, decrement number1 by 4 and increment number2 by 3 until i < j.
            Find final values of i and j.
         */
        int number1 =50, number2=5;
        while(number1>number2){
                number1 = number1 - 4;
                number2 = number2 + 2;
            System.out.println("number1 is " + number1);
            System.out.println("number2 is " + number2);
        }

        // Question 3: Reverse a Number
        int number3 =12345;
        int reversed = 0;
        while (number3 !=0){
            int digit = number3 % 10;
            reversed = reversed * 10 + digit;
            number3 /= 10;
        }
        System.out.println(reversed);

        // Nested while: > Print prime number 1-100
        int number5 = 2;
        while(number5<=100){
             int i1 =2;
             boolean prime = true;
             while(i1*i1 <=number5){
                 if(number5 % i1 == 0){
                     prime =false;
                     break;
                 }
                 i1++;
             }
             if(prime){
                 System.out.println(number5 + " is prime");
             }
             number5++;
        }

    }
}
