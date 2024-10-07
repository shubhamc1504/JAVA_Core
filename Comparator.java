import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Comparator{
    public static void main(String[] args) {
    
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
    
        List<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(34);
        nums.add(81);
        nums.add(98);

        Collections.sort(nums,com);
        System.out.println(nums);

    }
}
