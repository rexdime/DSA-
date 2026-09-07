class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        int j=letters.length-1;
        char ans=letters[0];
        while(i<=j){
            int mid=(i+j)/2;
            char midchar=letters[mid];
            if(midchar<=target){
                i=mid+1;
            }
            else{
                ans=midchar;
                j=mid-1;
            }
        }
        return ans;
    }
}