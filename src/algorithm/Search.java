package algorithm;

public class Search {
    public static void main(String [] args) {
        Search search = new Search();
        System.out.println(search.searchItem(12));
    }

    int[] userId = {
            12, 487, 3, 999, 45, 678, 1024, 56, 7, 890,
            234, 65, 4321, 18, 76, 543, 210, 98, 345, 777,
            14, 600, 81, 902, 37, 444, 159, 73, 808, 91,
            256, 19, 670, 84, 501, 33, 720, 64, 905, 27,
            111, 222, 333, 4444, 555, 666, 7777, 888, 9999, 101,
            202, 303, 404, 505, 606, 707, 8080, 909, 123, 321,
            432, 5432, 654, 765, 876, 987, 135, 246, 357, 468,
            579, 680, 791, 802, 913, 124, 235, 346, 457, 568,
            679, 780, 891, 9021, 1011, 1112, 1213, 1314, 1415, 1516
    };

    boolean found = false;
    public String searchItem(int value){
        for(int x:userId) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if(found)
            return "User ID " + value + " is found on the system";
        else
            return "User ID not found";
    }

}
