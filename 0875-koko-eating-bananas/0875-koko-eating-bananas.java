class Solution {
    private int time(int[] arr , int t,int h){
        int totaltime =0;
        for(int pile:arr){
            totaltime+=(pile+t-1)/t;

            if(totaltime>h){
                return totaltime;
            }
        }
        return totaltime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i =0;i<piles.length;i++){
           if(piles[i]>=max){
            max = piles[i];
           }
        }
        int l =1;
        int r = max;
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int reqtime = time(piles,mid,h);
            if(reqtime<=h){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}