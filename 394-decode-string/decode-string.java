class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> mainS = new Stack<>();

        int number = 0;
        String current = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            else if (ch == '[') {
                num.push(number);
                mainS.push(current);
                number = 0;
                current = "";
            }
            else if (ch == ']') {
                int repeat = num.pop();
                String previous = mainS.pop();

                String temp = "";
                for (int j = 0; j < repeat; j++) {
                    temp += current;
                }

                current = previous + temp;
            }
            else {
                current += ch;
            }
        }

        return current;
    }
}