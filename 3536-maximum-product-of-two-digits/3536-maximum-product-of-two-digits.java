class Solution {
    public int maxProduct(int n) {
        int first = 0;
        int sec = 0;
        while(n>0){
            int d = n%10;
            if(d>=first){
                sec = first;
                first = d;
            }
            else if(d>sec){
                sec = d;
            }
            n /= 10;
        }
        return first*sec;
    }
}