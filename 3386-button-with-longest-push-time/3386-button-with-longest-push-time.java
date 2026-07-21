class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][0];
        int sum = events[0][1];
        for(int i=1;i<events.length;i++){
            int currsum = events[i][1]-events[i-1][1];
            if(currsum>sum){
                max = events[i][0];
                sum = currsum;
            }else if (currsum == sum && events[i][0] < max) {
                max = events[i][0];
            }
        }
        return max;
    }
}