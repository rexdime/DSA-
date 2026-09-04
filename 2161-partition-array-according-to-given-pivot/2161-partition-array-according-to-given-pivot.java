class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for(int i=left;i<nums.length;i++){
            if(nums[i]<pivot){
                result[left]=nums[i];
                left++;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>pivot){
                result[right]=nums[i];
                right--;
            }
        }
        for(int i=left;i<=right;i++) {
            result[i]=pivot;
        }
        return result;
    }
}