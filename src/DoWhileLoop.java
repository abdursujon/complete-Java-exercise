public class DoWhileLoop {
    public static void main (String [] args) throws java.io.IOException{
        // do while loop
        // do something when some condition in while is true
        int n =10;
        do{
            System.out.println("Tick " + n);
            n--;
        } while (n>0);

        // Print number 1 to 100 by incrementing 2 every time
        int number4 = 0;
        do {
            System.out.println("Pattern fo 2 increment: " + number4);
            number4 +=2;
        }while (number4 <=100);


        // Using a do-while to process a menu selection of iteration statement
        char choice;
        do {
            System.out.println("""
                    Help on:
                       1. if
                       2. switch
                       3. while
                       4. do-while
                       5. for
                    """);
            choice = '3';
        } while (choice < '1' || choice > '5');

        switch (choice) {

            case '1':
                System.out.println("""
                        The if:
                        if (condition) statement;
                        else statement;

                        Example:
                        int x = -100;
                        if (x > 0) {
                            System.out.println("Positive");
                        } else {
                            System.out.println("Non-positive");
                        }
                        """);
                break;

            case '2':
                System.out.println("""
                        The switch:
                        switch(expression) {
                            case constant:
                                statement sequence;
                                break;
                            // ...
                        }

                        Example:
                        int day = 2;
                        switch (day) {
                            case 1:
                                System.out.println("Monday");
                                break;
                            case 2:
                                System.out.println("Tuesday");
                                break;
                        }
                        """);
                break;

            case '3':
                System.out.println("""
                        The while:
                        while (condition) statement;

                        Example:
                        int i = 1;
                        while (i <= 5) {
                            System.out.println(i);
                            i++;
                        }
                        """);
                break;

            case '4':
                System.out.println("""
                        The do-while:
                        do {
                            statement;
                        } while (condition);

                        Example:
                        int i = 1;
                        do {
                            System.out.println(i);
                            i++;
                        } while (i <= 5);
                        """);
                break;

            case '5':
                System.out.println("""
                        The for:
                        for (init; condition; iteration) statement;

                        Example:
                        for (int i = 1; i <= 5; i++) {
                            System.out.println(i);
                        }
                        """);
                break;
        }
    }
}






