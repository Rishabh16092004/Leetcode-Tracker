class Solution {
    public int countCommas(int n) {
        int num = 1000;

        if(n<1000){
            return 0;
        }
        return n-1000+1;
    }
}