class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double max_avg=0;
        double result=Double.NEGATIVE_INFINITY;
        while(j<nums.length){
            max_avg=(max_avg+nums[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                result=Math.max(result,max_avg);
                j++;
                i++;
                max_avg=(max_avg-nums[i-1]);
            }
        }
        return result/k;
    }
}