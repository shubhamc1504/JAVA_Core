public class MultiDimensionalArray {
    public static void main(String[] args) {
        int nums[][]= new int[3][4]; //nums var with 
        for(int i=0; i<3;i++) //rows
        {
            for(int j=0;j<4;j++) //columns
            {
                nums[i][j]= (int)(Math.random()*10); //type casted random numbers to int 
                System.out.println(nums[i][j]);
            }
        }

        for(int i=0; i<3;i++) //rows
        {
            for(int j=0;j<4;j++) //columns
            {
    
                System.out.println(" ");
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }
        // for(int n[]:nums) //For each loop
        // {

        //     for(int m:n)
        //     {
        //         System.out.println(m);
                
        //     }
        // }

    }
    
}
