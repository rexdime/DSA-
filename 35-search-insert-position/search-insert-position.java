class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=nums.length-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]>=target){
                return j;
            }
        }
          return i+1;

    }
}