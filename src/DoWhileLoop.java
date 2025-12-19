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
             System.out.println("Help on: ");
             System.out.println("   1. if");
             System.out.println("   2. switch");
             System.out.println("   3. while");
             System.out.println("   4. do-while");
             System.out.println("   5. for\n");
             //choice = (char) System.in.read();
             choice ='3';
         } while(choice <'1' || choice >'5');

         switch(choice){
                 case '1':
                     System.out.println("The if:");
                     System.out.println("if(condition) statement;");
                     System.out.println("else statement; \n");
                     System.out.println("Example: ");
                     System.out.println("int x = -100");
                     System.out.println("if (x > 0) {");
                     System.out.println("    System.out.println(\"Positive\");");
                     System.out.println("} else {");
                     System.out.println("    System.out.println(\"Non-positive\");");
                     System.out.println("}");
                     break;

                 case '2':
                     System.out.println("The switch:\n");
                     System.out.println("switch(expression) {");
                     System.out.println("    case constant:");
                     System.out.println("        statement sequence");
                     System.out.println("        break;");
                     System.out.println("    //...");
                     System.out.println("}\n");
                     System.out.println("Example:");
                     System.out.println("int day = 2;");
                     System.out.println("switch (day) {");
                     System.out.println("    case 1:");
                     System.out.println("        System.out.println(\"Monday\");");
                     System.out.println("        break;");
                     System.out.println("    case 2:");
                     System.out.println("        System.out.println(\"Tuesday\");");
                     System.out.println("        break;");
                     System.out.println("}");
                     break;

                 case '3':
                     System.out.println("The while:");
                     System.out.println("while(condition) statement;\n");
                     System.out.println("Example:");
                     System.out.println("int i = 1;");
                     System.out.println("while (i <= 5) {");
                     System.out.println("    System.out.println(i);");
                     System.out.println("    i++;");
                     System.out.println("}");
                     break;

                 case '4':
                     System.out.println("The do-while:");
                     System.out.println("do {");
                     System.out.println("    statement;");
                     System.out.println("} while (condition); \n");
                     System.out.println("Example:");
                     System.out.println("int i = 1;");
                     System.out.println("do {");
                     System.out.println("    System.out.println(i);");
                     System.out.println("    i++;");
                     System.out.println("} while (i <= 5);");
                     break;

                 case '5':
                     System.out.println("The for:\n");
                     System.out.print("for(init; condition; iteration)");
                     System.out.println(" statement;\n");
                     System.out.println("Example:");
                     System.out.println("for (int i = 1; i <= 5; i++) {");
                     System.out.println("    System.out.println(i);");
                     System.out.println("}");
                     break;
         }
    }
}
