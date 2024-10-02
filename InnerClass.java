//static can be used only in Inner class
class A{
    int age;
    public void show()
    {
        System.out.println(" in A show");
    }
    static class B {
        public void config()
        {
            System.out.println("in B config");
        } 
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A ob = new A();
    ob.show();

    A.B ob1 = new A.B();
    ob1.config();
    }  
}

