class Q344_27feb {
    public void reverseString(char[] s) 
    {
        int left = 0;
        int right = s.length - 1;

        while(left < right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}