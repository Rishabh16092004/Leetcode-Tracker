class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int Profit = 0;
        for(int num : worker){
            int curr = 0;
            for(int i=0;i<difficulty.length;i++){
                if(num>=difficulty[i]){
                    curr = Math.max(curr,profit[i]);
                }
            }
            Profit += curr;
        }
        return Profit;
    }
}