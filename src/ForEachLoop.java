// Refer to as enhanced for loop
public class ForEachLoop {
    public static void main (String [] args){
    // ForEachLoop Handles array
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
}

}
