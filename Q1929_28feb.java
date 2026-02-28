public class Q1929_28feb 
{
    public int[] getConcatenation(int[] nums) 
    {
        int n1 = nums.length;
        int[] ans = new int[2 * n1];
        for(int i = 0; i < n1; i++)
        {
            ans[i] = nums[i];
            ans[i + n1] = nums[i];  
        }

        return ans;
    }
}
    

