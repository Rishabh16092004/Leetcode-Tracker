class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        } 

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int unique = list.size();
        for (int f : list) {
            if (k >= f) {
                k -= f;
                unique--;
            } else {
                break;
            }
        }
        return unique;
    }
}