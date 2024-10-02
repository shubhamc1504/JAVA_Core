class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        A obj = (A) new B(); //Upcasting: Object of B but reference of A
        obj.show1();

        B obj2 = (B) obj; //Downcasting
        obj2.show2(); 
    }
}
