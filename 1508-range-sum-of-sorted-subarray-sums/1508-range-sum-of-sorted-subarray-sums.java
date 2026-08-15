class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                list.add(sum);
            }
        }
        long ans = 0;
        Collections.sort(list);
        for(int i=left-1;i<right;i++){
            ans += list.get(i);
            ans %= 1000000007;
        }
        return (int)ans;
    }
}