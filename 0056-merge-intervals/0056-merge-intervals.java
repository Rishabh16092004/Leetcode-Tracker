class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        int prevstart = intervals[0][0];
        int prevend = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int currstart = intervals[i][0];
            int currend = intervals[i][1];
            if(currstart<=prevend){
                prevend = Math.max(prevend,currend);
            }
            else{
                ans.add(new int[]{prevstart,prevend});
                prevstart = currstart;
                prevend = currend;
            }
        }
        ans.add(new int[]{prevstart,prevend});
        return ans.toArray(new int[ans.size()][]);
    }
}