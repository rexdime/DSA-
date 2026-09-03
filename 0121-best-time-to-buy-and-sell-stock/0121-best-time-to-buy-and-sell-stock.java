class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int profit=0;
        int maxprofit=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                profit=prices[r]-prices[l];
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                l=r;  
            }
             r++;
        }
        return maxprofit;
    }
}