class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                res=Math.min(res,i-low+1);
                sum-=nums[low];
                low++;
             }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}