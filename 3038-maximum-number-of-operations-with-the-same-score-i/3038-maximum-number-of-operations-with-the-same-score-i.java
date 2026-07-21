class Solution {
    public int maxOperations(int[] nums) {
        int ops = 1;
        int sum =nums[0]+nums[1];
        for(int i=2;i<nums.length-1;i+=2){
            int currsum = nums[i]+nums[i+1];
            if(sum!=currsum){
                break;
            }
            ops++;
        }
        return ops;
    }
}