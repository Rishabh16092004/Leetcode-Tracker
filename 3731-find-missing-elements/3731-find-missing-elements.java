class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max)max = num;
            if(num < min)min = num;
        }

        int[] arr = new int[101];
        for(int i=0;i<nums.length;i++) {
            arr[nums[i]]++;
        }
        for(int i=min;i<=max;i++) {
            if(arr[i] == 0) {
                ans.add(i);
            }
        }
        return ans; 
    }
}