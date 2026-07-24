class Solution {
    public boolean stoneGame(int[] piles) {
        int left = 0;
        int right = piles.length-1;
        int alice = 0;
        int bob = 0;
        while(left<right){
            int n = piles[left];
            int m = piles[right];
            if(n>=m){
                alice += n;
                bob += m;
                left++;
                right--;
            }
            if(m>n){
                alice += m;
                bob += n;
                left++;
                right--;
            }
        }
        return alice>bob;
    }
}