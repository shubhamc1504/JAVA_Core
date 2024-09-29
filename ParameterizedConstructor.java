class Human{
    //Instantiating a private variable which is restricted to the same class
    private int age;
    private String name;

    //Constructor - special method, returns nothing, same name as class name

    public Human() //Default constructor
    {
        //Assigning values in the constructor
        age = 12;
        name = "Shubh";
        System.out.println("in constructor");
    }

    public Human(int a, String n) //Parametrized constructor
    {
        //Assigning values in the constructor
        age = a;
        name = n;
        System.out.println("in parametrized constructor");
    }
    //getters
    public int getAge() //Creating a method getAge() within the same class to fetch data with return type int.
    {
        return age;
    }

    //setters
    public void setAge(int a) //Creating a method setAge() to set age with no return type.
    {
        this.age = a;
    }
    public String getName() //Creating a method getName() within the same class to fetch data with return type String.
    {
        return name;
    }
    public void setName(String n) //Creating a method setName() within the same class to pass data with no return type.
    {
        this.name = n; 
    }
}

public class ParameterizedConstructor {
    public static void main(String[] a) {
        Human ob = new Human(); // here default constructor is called
        Human ob1 = new Human(18, "Mayur"); //here parameterized constructor is called
        System.out.println(ob.getName() + " : " + ob.getAge()); //prints name and age
        System.out.println(ob1.getName() + " : " + ob1.getAge());
    }  
}
