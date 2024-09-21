// Implicitly provide the value to a variable = Conversion.
//Conversion Eg: byte b=127; int a =12; a=b (a will become byte now)
// Explicitly provide the value to a variable = Casting.
//Casting Eg: byte b=127; int a =12; b=(byte)a;

class Type
{
    public static void main(String args[])
    {
        byte b = 127;
        double a = b; // Conversion from byte to double
        System.out.println(a);
        int c = 257;
        byte k =(byte) c; // Type casting of int to byte
        System.out.println(k);
        float f = 6.9f;
        int x  = (int) f; // Type casting of float to int
        System.out.println(x);
    }
}