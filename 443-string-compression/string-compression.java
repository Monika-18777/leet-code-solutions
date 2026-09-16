class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;

        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                i++;
                count++;
            }

            chars[j] = ch;
            j++;

            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[j] = c;
                    j++;
                }
            }
        }

        return j;
    }
}