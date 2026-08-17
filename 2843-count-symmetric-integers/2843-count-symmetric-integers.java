class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count =0;
        while(low<=high){
            if(symmetric(low)){
                count++;
            }
            low++;
        }
        return count;
    }

    public static boolean symmetric(int left){
        String s = String.valueOf(left);
        int n = s.length();
        int start = 0;
        int end = 0;
        
        if(n%2!=0){
            return false;
        }
        else{
            int i=0;
            while(i<n){
                start += Character.getNumericValue(s.charAt(i));;
                end += Character.getNumericValue(s.charAt(n-1));;
                i++;
                n--;
            }
        }

        if(start==end)return true;
        return false;
    }
}