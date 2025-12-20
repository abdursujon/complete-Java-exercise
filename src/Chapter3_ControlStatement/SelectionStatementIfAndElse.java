package Chapter3_ControlStatement;

public class SelectionStatementIfAndElse {
    public static void main (String [] args){
        SelectionStatementIfAndElse select = new SelectionStatementIfAndElse();
        boolean dataAvailable = select.isDataAvailable();
        if(dataAvailable)
            System.out.println(select.ProcessData());
        else
            System.out.println(select.waitForMoreData());

        // Nested if
        System.out.println(select.nestedIf(0, 10, 777));

        // if-elseif-else  ladder
        System.out.println(select.whatSeason(9));
    }

    public boolean isDataAvailable(){
        return Math.random()>.5;
    }

    public String ProcessData(){
        return "Hi I am Sujon";
    }

    public String waitForMoreData(){
        return "Waiting for more data";
    }

    //Nest if method
    int a=14, b=11, c=6,d=66;
    public String nestedIf(int i, int j, int k){
        if(i==10){
            if(j<20) a =b;
            if(k>100) c =d;
            else a =c;
        }
        else a =d;
        return "a: " + a + "; b: " +b + "; c: " + c + "; d: " + d;
    }

    // The if-else-if ladder: print the season depending on which month is selected
    String season;
    public String whatSeason(int month){
        if(month == 12 || month ==1 || month ==2)
            season = "It's Winter now, don't always sleep like a lazy bastard";
        else if(month == 3 || month ==4 || month ==5)
            season = "It's Spring now, the most fabulous season of all!";
        else if(month == 6 || month == 7 || month == 8)
            season = "It's Summer time to go on holiday!";
        else if(month == 9 || month == 10 || month ==11)
            season = "It's Autumn, winter is approaching eww";
        else
            season = "You are out of your mind!";
        return season;
    }
}
