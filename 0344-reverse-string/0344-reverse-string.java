class Solution {
    public void reverseString(char[] s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length;i++){
            s1.push(s[i]);
        }
        for(int i=0;i<s.length;i++){
            char top=s1.peek();
            s1.pop();
            s[i]=top;
        }
    }
}