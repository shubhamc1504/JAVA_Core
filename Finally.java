public class Finally {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try{
            j =10/i;
            System.out.println(j);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong!!" + e);
        }
        finally{ //block executes to close the resource.
            System.out.println("Bye!");
        }
    }
    
}
