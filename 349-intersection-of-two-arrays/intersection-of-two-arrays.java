class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i:nums1){
           set.add(i);
        }
        
        for(int x:nums2){
            if(set.contains(x)){
                set1.add(x);
            }
    
        }  
        int result[]=new int[set1.size()];
        int k=0;
        for(int i:set1){
            result[k]=i;
            k++;
        }
        return result;
    }
}