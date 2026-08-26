class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String z="";
        for(int i=s.length()-1;i>=0;i--){
            z+=s.charAt(i);
        }
        return s.equals(z);
    }
}