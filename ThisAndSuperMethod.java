class A //Extends Object class by default
{

    public A() // Default Constructor
    {
        super(); // Execute constructor of Super class
        System.out.println("in A");;
    }
    public A(int n) //Parametrized Constructor
    {
        super(); // Execute constructor of Super class
        System.out.println("in A int");;
    }
}
class B extends A
{

    public B() // Default Constructor
    {
        super(); // Execute constructor of Super class
        System.out.println("in B");;
    }
    public B(int n) //Parametrized Constructor
    {
        this(); //Executes constructor of same class
        //super(); // Execute constructor of Super class
        System.out.println("in B int");;
    }
}

public class ThisAndSuperMethod {
    public static void main(String[] args) {
        //B obj1 = new B(); //Default Constructor
        B obj2 = new B(5); //Default Constructor
    }
}
