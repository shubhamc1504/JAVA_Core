public class Literals {
    //Literals are literally the values being stored in a variable
    public static void main(String a[])
    {
        int num1 = 9;
        System.out.println(num1);

        int num2 = 0b101; //binary for 5
        System.out.println(num2);

        int num3 = 0x7E; //hexadecimal format for 126
        System.out.println(num3);

        int num4 =100_00_00_000;
        System.out.println(num4);

        float f = 56f;
        System.out.println(f);

        double d1 = 56;
        System.out.println(d1);

        double d2 = 12e10;
        System.out.println(d2);

        int c1 ='a';
        c1 =c1+1;
        System.out.println(c1);
    }
}
