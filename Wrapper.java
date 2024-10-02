public class Wrapper {
    public static void main(String[] args) {
        int num = 9; //here int is primitive datatype
        Integer num1 = num; //auto boxing: storing the primitive var value to reference obj

        int num2 = num1; //auto unboxing: unwrapping/fetching the value into the primitive variable

        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);
    }
    
}
