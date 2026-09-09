class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (prefix[j] <= queries[i]) {
                    count = j + 1;
                } else {
                    break;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}