class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
        }

        int ans = max;
        int i = 1;
        while(k-->1){
            ans += max + i++;
        }
        return ans;
    }
}