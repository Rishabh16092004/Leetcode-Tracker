class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        int n = nums.length;
        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int x : set) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }
        }

        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                ans = Math.max(ans, entry.getKey());
            }
        }

        return ans;
    }
}