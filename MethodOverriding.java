//MethodOverriding: Same method name, number of parameters but different behavior
class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

}

class AdvCalc extends Calc 
    {
        public int add(int n1, int n2)
        {
           return n1+n2+1;
        } 
    }

public class MethodOverriding
{
    public static void main(String[] args) 
    {
     
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 7);
        System.out.println(r1);
    }
}