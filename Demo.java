class Calculator
{
    int a;
    public int add (int n1,int n2)
    {
        int r = n1+n2;
        return r;
    }

    public class Demo {
    
        public static void main (String a[])
        {
            int num1 = 5;
            int num2 = 10;

            Calculator calc = new Calculator();

            int result = calc.add(num1, num2);
            System.out.println("Result is: "+result);
        }  
    }
}