public class ForLoop {

    public static void main(String[] args) {

        for(int i = 1; i <= 5 ; i++) //Days of a week
        {

            System.out.println("DAY " +i);
            System.out.println("---------------------------------------------------");
            
            for(int j = 1; j<=9; j++)
            {

                System.out.println(" " +(j+10)+ ":00 "+"Hr" + "-" +(j+11)+ ":00 "+"Hr"); // Working hour breakup
            }
        }
    }
}