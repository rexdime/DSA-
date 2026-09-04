class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i : nums) {
            if (i < pivot) {
                count1++;
            } else if (i == pivot) {
                count2++;
            } else {
                count3++;
            }
        }

        int left[] = new int[count1];
        int mid[] = new int[count2];
        int right[] = new int[count3];

        int ind1 = 0;
        int ind2 = 0;
        int ind3 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                left[ind1] = nums[i];
                ind1++; 
            } else if (nums[i] == pivot) {
                mid[ind2] = nums[i];
                ind2++;
            } else {
                right[ind3] = nums[i];
                ind3++;
            }
        }

        
        int current = 0;
        int result[] = new int[nums.length];

        
        for (int i = 0; i < left.length; i++) {
            result[current] = left[i];
            current++;
        }
        for (int i = 0; i < mid.length; i++) {
            result[current] = mid[i];
            current++;
        }

    
        for (int i = 0; i < right.length; i++) {
            result[current] = right[i];
            current++;
        }

        return result;
    }
}
