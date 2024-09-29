class Human
{

    //Instantiating a private variable which is restricted to the same class
    private int age;
    private String name;

    //getters
    public int getAge() //Creating a method getAge() within the same class to fetch data with return type int.
    {
        return age;
    }

    //setters
    public void setAge(int a) //Creating a method setAge() to set age with no return type.
    {

        age  = a; //Here a is a local variable whereas age is an instance variable
    }

    public String getName() //Creating a method getName() within the same class to fetch data with return type String.
    {
        return name;
    }

    public void setName(String n) //Creating a method setName() within the same class to pass data with no return type.
    {
        name = n; //Here n is a local variable whereas name is an instance variable
    }
}


public class Encapsulation
{
    public static void main(String[] args) {

        Human ob = new Human();
        // Assigning value with the help of methods
        ob.setAge(26);
        ob.setName("Shubham");

        System.out.println(ob.getName() + " : " + ob.getAge());
    }
}