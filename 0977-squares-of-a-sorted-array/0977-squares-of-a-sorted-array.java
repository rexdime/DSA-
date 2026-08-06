class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
        int k=0;
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]*nums[i]);
            }
            else{
                pos.add(nums[i]*nums[i]);
            }
        }
        int m=0;
        int n=neg.size()-1;
        while(m<pos.size() && n>=0){
            if(pos.get(m)<=neg.get(n)){
                a[k]=pos.get(m);
                k++;
                m++;
            }
            else{
                a[k]=neg.get(n);
                k++;
                n--;
            }

            }
            while(m<pos.size()){
                a[k]=pos.get(m);
                k++;
                m++;
            }
            while(n>=0){
                a[k]=neg.get(n);
                k++;
                n--;
            }
            return a;
        }
    }
