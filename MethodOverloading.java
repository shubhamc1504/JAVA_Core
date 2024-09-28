class Calculator
{

    public int add(int n1, int n2)
    {
        return (n1 + n2);
    }
    public int add(int n1, int n2, int n3)
    {
        return (n1 + n2 + n3);
    }
    public double add(double n1, double n2)
    {
        return (n1 + n2);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator ob = new Calculator();

        int r1 = ob.add(3, 5);
        int r2 = ob.add(3, 5, 9);
        int r3 = ob.add(45, 56);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
    
}
