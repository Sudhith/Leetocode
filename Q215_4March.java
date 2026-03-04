class Q215_4March
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
        
}