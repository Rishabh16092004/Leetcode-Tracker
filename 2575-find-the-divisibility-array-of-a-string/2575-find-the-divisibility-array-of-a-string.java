class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] arr = new int[word.length()];
        long rem = 0;
        for(int i=0;i<word.length();i++){
            int digit = word.charAt(i)-'0';
            rem = (rem*10 + digit)%m;
            if(rem == 0){
                arr[i] = 1;
            }
        }
        return arr;
    }
}