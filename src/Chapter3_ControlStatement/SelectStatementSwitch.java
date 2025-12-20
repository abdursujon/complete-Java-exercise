package Chapter3_ControlStatement;

public class SelectStatementSwitch {
    public static void main (String [] args){
        for(int i=0; i<5; i++)
            switch(i){
                case 0:
                    continue;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is greater than three");
            }

        for(int i =0; i<=12; i++)
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                default:
                    System.out.println("i is greater or equal to 10");
            }

        // String switch to check if a string is matched
        String str = "one";
        switch(str){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match found try again");
                break;
        }

        // Nested switch
        int a =1, b=2;
        switch(a){
            case 1:
                switch(b){
                    case 1:
                        System.out.println("a = 1; b = 1");
                        break;
                    case 2:
                        System.out.println("a = 1; b = 2");
                        break;
                }
            case 2:
               System.out.println("b = 2");
               break;
        }

    }
}
