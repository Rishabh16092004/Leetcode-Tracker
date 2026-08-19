class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
        if(x>=y){
            score += remove(s,'a','b',x);
            s = remaining;
            score += remove(s,'b','a',y);
        }
        else{
            score += remove(s,'b','a',y);
            s = remaining;
            score += remove(s,'a','b',x);
        }
        return score;
    }

    String remaining;
    public int remove(String s,char first,char last,int val){
        StringBuilder sb = new StringBuilder();
        int score = 0;
        for(char ch : s.toCharArray()){
            if(sb.length()>0 && sb.charAt(sb.length()-1)==first && ch==last){
                sb.deleteCharAt(sb.length()-1);
                score += val;
            }
            else{
                sb.append(ch);
            }
        }
        remaining = sb.toString();
        return score;
    }
}