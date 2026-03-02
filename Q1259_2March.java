class Q1259_2March {
    public int findNumbers(int[] nums) 
    {
        int even = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int count = 0;
            int n = nums[i];
            while(n > 0)
            {
                int d = n % 10;
                count++;
                n /= 10;
            }
            if(count % 2 == 0)
            {
                even++;
            }
        }
        return even;
    }
}