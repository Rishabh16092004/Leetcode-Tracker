class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        for (int num : arr) {
            Set<Integer> next = new HashSet<>();
            next.add(num);
            for (int x : curr) {
                next.add(x | num);
            }

            curr = next;
            result.addAll(curr);
        }

        return result.size();
    }
}