class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);                 // get the character at index i

            if (c == '(') st.push(')');           // push what we expect to see later
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else if (st.isEmpty() || st.pop() != c) return false; // must match the expected closer
        }
        return st.isEmpty();
    }
}