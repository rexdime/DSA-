class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums2.length;
        int[] ng = new int[m];                      
        Stack<Integer> st = new Stack<>();
        for (int j = m - 1; j >= 0; j--) {        
            while (!st.isEmpty() && st.peek() <= nums2[j]) st.pop();
            ng[j] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[j]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < m; j++) {           
                if (nums2[j] == nums1[i]) { res[i] = ng[j]; break; }
            }
        }
        return res;
    }
}