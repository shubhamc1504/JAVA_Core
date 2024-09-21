public class WhileLoop {
    public static void main(String[] args) 
    {

        int i = 1;
        while (i <= 5) {
            System.out.println("Hi " + i);
            int j = 1;
            while(j <= 3) //Nested while loop
            {
                System.out.println("Welcome!");
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);

    }
}
