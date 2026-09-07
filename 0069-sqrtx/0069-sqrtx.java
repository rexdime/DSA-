class Solution {
    public int mySqrt(int x) {
        long i=0;
        long j=x;
        long ans=0;
        if(x==0||x==1){
            return x;
        }
        while(i<=j){
            long mid=(i+j)/2;
            if(mid*mid<=x){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
         return (int)ans;
    }
}