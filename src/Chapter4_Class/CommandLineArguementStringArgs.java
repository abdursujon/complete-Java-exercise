package Chapter4_Class;

public class CommandLineArguementStringArgs {
    public static void main (String [] args){

        // Test the for loop type int terminal:
        //  javac Chapter4_Class\CommandLineArguementStringArgs.java
        //  java Chapter4_Class.CommandLineArguementStringArgs this is a test 100 -1
        for(int i = 0; i<args.length; i++){
            System.out.println("args [" + i + "] : " + args[i]);
        }
    }
}
