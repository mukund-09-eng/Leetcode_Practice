class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int zerocount =0;
        int n = nums.length;
        for(int num : nums){
            xor^=num;
            if(num==0){
                zerocount++;
            }

        }
        if(xor!=0){
            return n;
        }
        if(zerocount==n){
            return 0;
        }
        return n -1;
    }
}