class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
            if (i == 0 && flowerbed[i] == 0 &&(flowerbed.length == 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
            if(i<flowerbed.length-1 && i!=0 && flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                flowerbed[i] = 1;
                n -= 1;
            }
            if(i==flowerbed.length-1 && i!=0 && flowerbed[i-1]==0 && flowerbed[i]==0){
                flowerbed[i] = 1;
                n -= 1;
            }
            if(n==0)return true;
        }
        return false;
    }
}