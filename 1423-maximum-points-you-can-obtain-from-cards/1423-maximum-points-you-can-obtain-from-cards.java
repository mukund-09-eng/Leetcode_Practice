class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
         int n = cardPoints.length;
        for(int i =0;i<k;i++){
            sum+=cardPoints[i];
        }
        int max = sum;
        int l =0;
        for(int i = k-1;i>=0;i--){
            l++;
            sum = sum - cardPoints[i] + cardPoints[n-l];
            max = Math.max(sum ,max);
        }
        return max;
    }
}