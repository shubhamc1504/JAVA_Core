public class IfElseIfLoop {
    public static void main(String args[])
    {
        int x = 18;
        int y = 20;
        int z = 6;
        
        if(x > y && x > z)
        {
            System.out.println(x);
            System.out.println(x + " is the largest");
        }
        else if (y > z && y > x){
            System.out.println(y);
            System.out.println(y + " is the largest");
        }
        else{
            System.out.println(z);
            System.out.println(z + " is the largest");
        }
        
    }
}
