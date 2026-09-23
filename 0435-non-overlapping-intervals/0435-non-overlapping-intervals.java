class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);
        int count = 1;
        int last = intervals[0][1];
        for(int i =1;i<n;i++){
            int finishTime = intervals[i][1];
            int startTime = intervals[i][0];
            if(startTime>=last){
                count++;
                last = finishTime;
            }
        }
        return n-count;
    }
}