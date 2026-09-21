class Solution {
    public int countSubstrings(String s) {
              int st=0;
              int end=0;
              int count=0;
              for(int i=0;i<s.length();i++)
              {
                st=i;
                end=i;
                while(st>=0 && end<s.length() && s.charAt(st)==s.charAt(end))
                {
                        count++;
                        st--;
                        end++;
                }

              }

              for(int i=0;i<s.length();i++)
              {
                st=i;
                end=i+1;
                while(st>=0 && end<s.length() && s.charAt(st)==s.charAt(end))
                {
                        count++;
                        st--;
                        end++;
                }
              }
              return count;

    }
}