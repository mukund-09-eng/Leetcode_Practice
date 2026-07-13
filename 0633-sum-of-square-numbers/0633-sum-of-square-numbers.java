class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        int [] arr = new int[n+1];
        for(int i =0;i<n+1;i++){
            arr[i] = i;
        }
        long l = 0;
        long r = n;
        long sum = 0;
        while(l<=r){
            sum = l*l + r*r;
            if(sum<c){
                l++;
            }
            else if(sum > c ){
                r--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}