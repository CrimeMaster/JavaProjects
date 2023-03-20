import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    public static boolean containsDuplicate(int[] nums) {

        Set <Integer> uniques = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(uniques.contains(nums[i]))
            {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
        
    }
    public static void main(String[] args)
    {
        System.out.println("This is for practice");

        int [] nums = {1 , 2 , 3 , 4 , 1};

        System.out.println(containsDuplicate(nums));


    }
}
