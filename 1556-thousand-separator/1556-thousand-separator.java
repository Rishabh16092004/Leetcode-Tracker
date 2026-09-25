class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        if(n==0)return "0";
        int num = 0;
        while(n>0){
            sb.append(n % 10);
            n /= 10;
            num++;

            if (num % 3 == 0 && n > 0) {
                sb.append(".");
            }
        }
        return sb.reverse().toString();
    }
}