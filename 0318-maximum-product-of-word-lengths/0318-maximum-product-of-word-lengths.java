class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];

        for(int i=0;i<words.length;i++){
            for (char ch : words[i].toCharArray()) {
                int bit = ch - 'a';
                mask[i] |= (1 << bit);
            }
        }

        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((mask[i]&mask[j]) == 0){
                    int prod = words[i].length()*words[j].length();
                    max = Math.max(max,prod);
                }
            }
        }
        return max;
    }
}