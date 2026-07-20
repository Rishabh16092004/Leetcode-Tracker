class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long score = 0;
        boolean[] visit = new boolean[values.length];
        int i = 0;
        while(i<values.length && i>=0){
            if(visit[i])return score;
            if(instructions[i].equals("add") && !visit[i]){
                score += values[i];
                visit[i] = true;
                i++;
            }
            else{
                visit[i] = true;
                i += values[i];

            }
        }
        return score;
    }
}