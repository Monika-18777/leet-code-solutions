class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int arr[] = new int[n];

        int len = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                arr[i] = len;
                i++;
            } 
            else {
                if (len > 0) {
                    len = arr[len - 1];
                } 
                else {
                    arr[i] = 0;
                    i++;
                }
            }
        }

        return s.substring(0, arr[n - 1]);
    }
}