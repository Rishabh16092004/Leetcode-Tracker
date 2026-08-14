class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] number = new int[10];
        for(int i=0;i<secret.length();i++){
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if(s==g)bulls++;
            else{
                if(number[s]<0)cows++;
                if(number[g]>0)cows++;
                number[s]++;
                number[g]--;
            }
        }
        return bulls+"A"+cows+"B";
    }
}