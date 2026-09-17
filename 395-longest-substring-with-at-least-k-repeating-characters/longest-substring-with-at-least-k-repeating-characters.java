class Solution {
    public int longestSubstring(String s, int k) {

        int n = s.length();
        int answer = 0;
        for (int uniqueTarget = 1; uniqueTarget <= 26; uniqueTarget++) {

            int freq[] = new int[26];

            int left = 0;
            int right = 0;

            int unique = 0;
            int countAtLeastK = 0;

            while (right < n) {
                int index = s.charAt(right) - 'a';

                if (freq[index] == 0) {
                    unique++;
                }

                freq[index]++;

                if (freq[index] == k) {
                    countAtLeastK++;
                }
                while (unique > uniqueTarget) {

                    int leftIndex = s.charAt(left) - 'a';

                    if (freq[leftIndex] == k) {
                        countAtLeastK--;
                    }

                    freq[leftIndex]--;

                    if (freq[leftIndex] == 0) {
                        unique--;
                    }

                    left++;
                }
                if (unique == uniqueTarget &&
                    countAtLeastK == unique) {

                    answer = Math.max(answer, right - left + 1);
                }

                right++;
            }
        }

        return answer;
    }
}