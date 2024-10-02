//Abstract: We can define the abtract method using abstract keyword.
//Abstract method can only be declared inside abstract class. But the abtract class should not compulsorily have abtract method.
//We cannot create object of abstract class. we can create the reference of it.

abstract class Car //Abstract class
{
    public abstract void drive(); //abstract method declared
    public void playMusic()
        {
            System.out.println("Playing music");
        }    
}

class WagonR extends Car{
    public void drive()
    {
        System.out.println("Driving");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car c = new WagonR();
        c.drive();
        c.playMusic();
    }
    
}
