public class Arrays {
    public static void main(String[] args) {
        //One dimensional array
        int [] month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("February has " + month_days[1] + " days");

        // Average an array of values
        double []numbers = {3.33, 333, 55, 555, 22.233, 66, 22 };
        double result = 0;

        for (int i = 0; i<numbers.length; i++){
            result += numbers[i];
        }
        System.out.println(result/numbers.length);


        //Multidimensional Arrays
        int [] [] twoD = new int [3] [13]; // first [10] numbers or rows second [13] numbers of column
        twoD[0] = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 0, 0};
        twoD[1] = new int []{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 0};
        twoD[2] = new int []{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        for(int i = 0; i<twoD.length; i++){
            for(int j = 0; j<twoD[i].length;j++){
                System.out.print(twoD[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
