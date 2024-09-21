public class ArithmeticOperations {
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 9;
        int result1 = num1 + num2; //Add
        int result2 = num1 - num2; //Substract
        int result3 = num1 * num2; //Multiply
        int result4 = num1 / num2; //Quotient
        int result5 = num1 % num2; //Remainder
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        num1 +=2; //Increment by 2
        System.out.println(num1);

        num2 -=3; //Decrement by 3
        System.out.println(num2);

        int num3 = 6;
        num3++; //post-increment
        System.out.println(num3);

        int num4 = 15;
        --num4; //pre- decrement
        System.out.println(num4);

        int result6 = num3++;
        System.out.println(result6);

        int result7 = ++num4;
        System.out.println(result7);
    }
}

