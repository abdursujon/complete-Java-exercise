package Chapter3_ControlStatement;

// Refer to as enhanced for loop
public class ForEachLoop {
    public static void main (String [] args){
    // Chapter3_ControlStatement.ForEachLoop Handles array
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 17};
    int sum = 0;
    for(int n:nums) {
        sum += n;
        if(n == 5) break;
        System.out.println("Value n is " + n);

    }
    System.out.println("Sum is " + sum);

    // n cannot chane the num array unless num itself(the array) change
    for(int n: nums){
        System.out.println(n + "");
        n = n * 10;
    }

    // For loop with for and for each
    int sum1 = 0;
    int num1 [][]= new int [3][5];
    for(int i=0; i<3; i++)
        for(int j = 0; j<5; j++)
            num1 [i][j]=(i+1)*(j+1);



    for (int x[]:num1){
        for(int y: x){
            System.out.println("Value is: " + y);
            sum1 +=y;
        }
    }
    System.out.println("Sum: " +sum1);

  }
}
