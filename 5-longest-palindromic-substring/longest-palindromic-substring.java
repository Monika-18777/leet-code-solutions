class Solution {
    public int expand(String s,int st,int end)
    {
        int n=s.length();
        while(st>=0 &&  end<n && s.charAt(st)==s.charAt(end))
        {
            st--;
            end++;
        }
        return end-st-1;
    }
    public String longestPalindrome(String s) {
        int st = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len>end-st+1)
            {
                st=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(st,end+1);

    }
}