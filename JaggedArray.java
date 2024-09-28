public class JaggedArray {

public static void main(String[] args) {

    int nums[][]= new int[3][]; //jagged array

    nums[0]= new int[3];
    nums[1]= new int[4];
    nums[2]= new int[2];

    for(int i=0; i<nums.length;i++) //rows
    {
        for(int j=0;j<nums[i].length;j++) //columns
        {
            nums[i][j]= (int)(Math.random()*10); //type casted random numbers to int 
            System.out.println(nums[i][j]);
        }
        System.out.println();
    }

    for(int n[]:nums) //For each loop
        {

            for(int m:n)
            {
                System.out.println(m + " "); 
            }
            System.out.println();
        }

    }
}