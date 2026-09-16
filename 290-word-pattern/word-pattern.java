class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");

        if (pattern.length() != word.length) {
            return false;
        }

        HashMap<Character, String> mp1 = new HashMap<>();
        HashMap<String, Character> mp2 = new HashMap<>();

        for (int i = 0; i < word.length; i++) {
            String str = word[i];
            char ch = pattern.charAt(i);

            if (mp1.containsKey(ch) && !mp1.get(ch).equals(str)) {
                return false;
            }

            if (mp2.containsKey(str) && !mp2.get(str).equals(ch)) {
                return false;
            }

            mp1.put(ch, str);
            mp2.put(str, ch);
        }

        return true;
    }
}