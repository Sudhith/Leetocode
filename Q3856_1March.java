public class Q3856_1March 
{
    public String trimTrailingVowels(String s) 
    {
        int i = s.length() - 1;

        while(i >= 0)
        {
            char c = s.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                i--;
            }
            else
            {
                break;
            }
        }

        return s.substring(0, i+1);
    }
}
