public class Q7_5March 
{

    public int reverse(int x) 
    {
        long d, r = 0;

        while(x != 0)
        {
            d = x % 10;
            r = r * 10 + d;
            x = x / 10;
        }

        if(r > Integer.MAX_VALUE || r < Integer.MIN_VALUE)
            return 0;

        return (int) r;
    }
}
    

