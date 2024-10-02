//Interface: Type of class where all methods are public abstract by default. Show Path/design of the methods but doesn't implement.
//Every variable in interface are final(initialize it at that time) and static by default.
interface A{
    void show(); //Methods are public abstract by default
    void config();
    int age = 26;
    String name = " Shubham";
}
class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");  
    }
}
public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.name+ " : " +A.age);
    }
}
