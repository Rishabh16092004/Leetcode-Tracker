class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        ans[0] = nums[0]+nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],max);
            ans[i] = ans[i-1]+nums[i]+max;
        }
        return ans;
    }
}