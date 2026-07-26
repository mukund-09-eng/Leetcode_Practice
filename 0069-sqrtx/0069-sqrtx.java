class Solution {
    public int mySqrt(int x) {
        int l =1;
        int r = x;
        int ans =0;
        while(l<=r){
            long mid= l+(r-l)/2;
            if(mid*mid<=x){
                ans = (int)mid;
                l=(int)(mid+1);
            }
            else{
                r = (int)(mid-1);
            }
        }
        return ans;
    }
}