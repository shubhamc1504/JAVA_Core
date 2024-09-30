class A{

    public A() // constructor called
    {
        System.out.println("Object created here");
    }
    public void show()
    {
        System.out.println("In A show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new A().show();; // create object -> Anonymous Object(no reference, no reuse)
    } 
}
