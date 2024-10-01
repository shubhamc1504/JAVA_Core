//Polymorphism: Compile time (behavior defined at compile-time. eg: Overloading) and run time(eg: overriding)
class A{

    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A{

    public void show()
    {
        System.out.println("in B show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
      A obj = new A(); // Reference of type A and Object of B (obj is of type A but implementation of B)
      
      obj.show(); //prints for obj A
      
      obj = new B();
      obj.show(); //prints for class B ->Runtime Polymorphism (Dynamic Dispatch)
    }
}
