class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 1;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                set.clear();
                count++;
            }
            set.add(ch);
        }
        return count;
    }
}