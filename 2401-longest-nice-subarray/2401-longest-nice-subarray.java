class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int bits=0;
        int maxlen=0;
        for(int right=0;right<nums.length;right++){
            while((bits & nums[right]) != 0){
                bits ^= nums[left];
                left++;
            }
            bits |= nums[right];
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}