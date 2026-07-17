class Solution {
    public int longestSubarray(int[] nums) {
        int l =0;
        int maxlen = 0;
        int curr=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                curr++;
            }
            while(curr>1){
                if(nums[l]==0){
                    curr--;
                }
                l++;
            }
            maxlen =Math.max(maxlen,i-l);
        }
        return maxlen;
    }
}