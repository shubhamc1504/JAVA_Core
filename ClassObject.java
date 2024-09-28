class Calculator
{

    public int add(int n1,int n2) //add method with 2 parameters n1 and n2
    {

        int r = n1+n2; //Add operation
        return r;
    }
}

public class ClassObject{
    public static void main(String[] args)
    {
        int num1= 15;
        int num2= 20;

        Calculator calc = new Calculator(); //Instance of Calculator class where calc is reference variable of Calculator, new is keyword and Calculator() is constructor
        int result = calc.add(num1,num2); //Calling method in main block
        System.out.println(result);

    }
}