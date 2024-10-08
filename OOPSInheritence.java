class Calc //Calc -> Parent, Base, Super
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

class AdvCalc extends Calc //AdvCalc -> Child, Derived, Sub
{
    public int mul(int n1, int n2)
    {
        return n1 * n2;
    }

    public int div(int n1, int n2)
    {
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc //Multi level inheritence
{
    public double power(int n1, int n2)
    {
        return Math.pow(4,3);
    }
}

public class OOPSInheritence {
    public static void main(String[] args) 
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5,9);
        int r2 = obj.sub(6,2);
        int r3 = obj.mul(4,7);
        int r4 = obj.div(9,3);
        double r5 = obj.power(4,3);
        System.out.println(r1 + " "+ r2 +" "+ r3 + " "+ r4 + " "+ r5);
    }
    
}
