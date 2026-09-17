class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int left = 0;
        int pairs = 0;
        int ans = 1;

        for (int right = 1; right < s.length(); right++) {

            if (s.charAt(right) == s.charAt(right - 1)) {
                pairs++;
            }

            while (pairs > 1) {
                if (s.charAt(left) == s.charAt(left + 1)) {
                    pairs--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}