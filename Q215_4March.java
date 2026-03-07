import java.util.Arrays;

public class Q215_4March
{
    public static int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
        
}