class Solution {
    public int Power(int n){
        int count = 0;
        while(n != 1){
            if(n%2==0){
                n /= 2;
            }
            else{
                n = 3*n + 1;
            }
            count++;
        }
        return count;
    }
    public int getKth(int lo, int hi, int k) {
        int[][] arr = new int[hi-lo+1][2];
        int index = 0;
        for (int i = lo; i <= hi; i++) {
            arr[index][0] = i;
            arr[index][1] = Power(i);
            index++;
        }

        java.util.Arrays.sort(arr,(a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        return arr[k-1][0];
    }
}