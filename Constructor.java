class Human{
    //Instantiating a private variable which is restricted to the same class
    private int age;
    private String name;

    //Constructor - special method, returns nothing, same name as class name
    public Human()
    {
        //Assigning values in the constructor
        age = 12;
        name = "Shubh";
        System.out.println("in constructor");
    }
    //getters
    public int getAge() //Creating a method getAge() within the same class to fetch data with return type int.
    {
        return age;
    }

    //setters
    public void setAge(int age) //Creating a method setAge() to set age with no return type.
    {
        this.age = age;
    }
    public String getName() //Creating a method getName() within the same class to fetch data with return type String.
    {
        return name;
    }
    public void setName(String name) //Creating a method setName() within the same class to pass data with no return type.
    {
        this.name = name; 
    }
}
public class Constructor {
public static void main(String[] args) {
        Human ob = new Human(); // here constructor is called
        //Human ob1 = new Human(); //here constructor is called
        // Assigning value with the help of methods
        // ob.setAge(26);
        // ob.setName("Shubham");
        System.out.println(ob.getName() + " : " + ob.getAge()); //prints name and age
    }    
}
