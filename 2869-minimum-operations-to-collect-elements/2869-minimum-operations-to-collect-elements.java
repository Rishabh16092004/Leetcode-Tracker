class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int total = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=nums.size()-1;i>=0;i--){
            total++;
            if(nums.get(i)<=k){
                set.add(nums.get(i));
            }
            if(set.size()==k)break;
        }
        return total;
    }
}