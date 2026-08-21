class Solution {
    public int addMinimum(String word) {
        int min = 1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)<=word.charAt(i-1)){
                min++;
            }
        }
        return min*3-word.length();
    }
}