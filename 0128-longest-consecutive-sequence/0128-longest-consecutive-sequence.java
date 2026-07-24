class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int cnt = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int curr  = 1;
                while(set.contains(n+1)){
                    curr++;
                    n += 1;
                }
                cnt = Math.max(cnt,curr);
            }
            
        }
        return cnt;
    }
}