class Mobile
{
    //Instance variable
    static String name; //created static variable which is shared by diff objects
    String brand;
    int price;

    public void show() //Creating method
    {
        System.out.println(name + " : " + brand + " : " + price);
    }

    public static void show1(Mobile obj1) //Creating static method show1()
    {
        System.out.println(name); // we cannot use non static variable using static method directly
        System.out.println(name + " : " + obj1.brand + " : " + obj1.price); // we can indirectly use the non static variable 
    }
}

public class Static {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        Mobile.name = "Smartphone"; // Can be called using class name as variable is static
        obj1.brand = "Apple";
        obj1.price = 2500;

        Mobile obj2 = new Mobile();
        Mobile.name = "Smartphone"; // Can be called using class name as variable is static
        obj2.brand = "Samsung";
        obj2.price = 2000;
    
        obj1.show(); //calling method and passing obj1 data
        obj2.show(); //calling method and passing obj2 data
        Mobile.show1(obj1); // we can call static method directly using class name

    }
    
}
