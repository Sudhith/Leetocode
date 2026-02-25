import java.util.*;

class Solution {

    // function to count set bits
    public int countBits(int n)
    {
        int count = 0;
        while(n > 0)
        {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public int[] sortByBits(int[] arr) 
    {
        Integer[] temp = new Integer[arr.length];

        // convert int[] to Integer[]
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        Arrays.sort(temp, (a, b) -> {
            int bitsA = countBits(a);
            int bitsB = countBits(b);

            // primary sort -> number of 1 bits
            if(bitsA != bitsB)
                return bitsA - bitsB;

            // secondary sort -> value
            return a - b;
        });

        // convert back to int[]
        for(int i = 0; i < arr.length; i++)
            arr[i] = temp[i];

        return arr;
    }
}