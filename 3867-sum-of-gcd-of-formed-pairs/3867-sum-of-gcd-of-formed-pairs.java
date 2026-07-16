class Solution {
     public int gcd(int a , int b){
       if(b == 0) return a;
    return gcd(b,a%b);
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int [] mx = new int[n];
        int [] prefixGcd = new int [n];
        int max = 0;
        for(int i =0;i<n;i++){
            max = Math.max(max,nums[i]);
            mx[i] = max;
        }
        for(int i =0;i<n;i++){
            prefixGcd[i] = gcd(mx[i],nums[i]);
        }
 Arrays.sort(prefixGcd);
        int l =0;
        int r = n-1;
        long sum =0;
        while(l<r){
            sum+=gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }
        return sum;
    }
}