//enum: class with constants. Cannot extend enum with other class.

enum Status
{
    Running, Walking, Cycling, Sitting;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Sitting;

        switch(s)
        {
            case Running:
                System.out.println("1000 calories are getting burned in 1hr");
                break;
            case Cycling:
                System.out.println("500 calories are getting burned in 1hr");
                break;
            case Walking:
                System.out.println("250 calories are getting burned in 1hr");
                break;
            default:
                System.out.println("Calories are getting accumulated.");
        }
    }
}
