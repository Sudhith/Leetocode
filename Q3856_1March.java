public class Q3856_1March 
{
    public String trimTrailingVowels(String s) 
    {
        int j = s.length() - 1;

        while(j >= 0)
        {
            char c = s.charAt(j);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                j--;
            }
            else
            {
                break;
            }
        }

        return s.substring(0, j+1);
    }
}
