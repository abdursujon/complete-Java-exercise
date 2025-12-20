package Chapter3_ControlStatement;

public class NestedLoops {
    public static void main(String [] args){

        for(int i =0; i<10; i++){
            for(int j=i; j<10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        // Create a heart shape by nested for loop
        int n = 20;

        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(".");
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(".");
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (i * 2) - 1; j++) System.out.print(".");
            System.out.println();
        }

    }
}
