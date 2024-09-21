public class LogicalOperators {
    public static void main(String args[])
    {
       int x = 8;
       int y = 5;
       int a = 6;
       int b = 9;

       boolean result = (x > y && a > b); // AND Operator
       System.out.println(result);

       boolean result2 = (x > y || a > b); //OR Operator
       System.out.println(result2);

       boolean result3 = (x > y);
       System.out.println(!result3); //NOT Operator
    }
}
