class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int cost = 0;
        int len = 0;

        for (int right = 0; right < s.length(); right++) {
            
            cost += Math.abs(s.charAt(right) - t.charAt(right));

            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            len = Math.max(len, right - left + 1);
        }

        return len;
    }
}