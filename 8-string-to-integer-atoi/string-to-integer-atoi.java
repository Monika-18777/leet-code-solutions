class Solution {
    public int myAtoi(String s) {
        int digit = 0;
        int sign = 1;
        char[] ch = s.toCharArray();
        int i = 0;

        while (i < s.length() && ch[i] == ' ') {
            i++;
        }

        if (i < s.length() && (ch[i] == '+' || ch[i] == '-')) {
            if (ch[i] == '-') {
                sign = -1;
            }
            i++;
        }

        while (i < s.length() && Character.isDigit(ch[i])) {
            int d = ch[i] - '0';

            if (digit > (Integer.MAX_VALUE - d) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            digit = digit * 10 + d;
            i++;
        }

        return digit * sign;
    }
}