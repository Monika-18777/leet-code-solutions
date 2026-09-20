class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s = new StringBuilder();

        int count = 0;

        while (s.length() < b.length()) {
            s.append(a);
            count++;
        }

        if (s.toString().contains(b)) {
            return count;
        }

        s.append(a);
        count++;

        if (s.toString().contains(b)) {
            return count;
        }

        return -1;
    }
}