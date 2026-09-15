class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())
        {
            return false;
        }
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(arr1[ch1]!=arr2[ch2])
            {
                return false;
            }
            arr1[ch1]=i+1;
            arr2[ch2]=i+1;
        }
        return true;
    }
}