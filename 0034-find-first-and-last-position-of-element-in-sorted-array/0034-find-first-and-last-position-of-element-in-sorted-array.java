class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null|| nums.length==0) return new int[]{-1,-1};
        int leftresult=-1;
        int rightresult=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                leftresult=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                rightresult=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
         return new int[]{leftresult, rightresult};
    }
}