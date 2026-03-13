public class Q45_9March 

{
    public int jump(int[] nums) 
    {
        int jumps = 0;
        int end = 0;
        int farthest = 0;

        for(int i = 0; i < nums.length - 1; i++)
        {
            if(i + nums[i] > farthest)
            {
                farthest = i + nums[i];
            }

            if(i == end)
            {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }
}
    
}
