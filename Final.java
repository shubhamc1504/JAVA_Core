//Final: variable(var becomes constant), method(stops method overriding), class(stops inheritence)
//final class A{ // Stops inheritence
class A{
    public void area(int a, int b)
    {
        System.out.println(a*b);
    }
    //public final void name() //stops method overriding
    public void name()
    {
        System.out.println("Shubham speaking");
    }
}
    class B extends A
    {
        public void name()
        {
            System.out.println("Sagar speaking");
        }
    }
public class Final {
    public static void main(String[] args) {
        // final int a = 5;
        // a = 9; //Cannot be changed as type is final
        // System.out.println(a);
        B ob = new B();
        ob.name();
        ob.area(6, 7);
    }
}
