class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int idx = 1;
        while(true){
            if(idx%k==0 &&!set.contains(idx)){
                break;
            }
            idx++;
        }
        return idx;
    }
}