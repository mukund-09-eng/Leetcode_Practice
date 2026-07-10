class Solution {
    public int longestOnes(int[] nums, int k) {
        int curr =0;
        int left =0;
        int max =0;
        for(int r =0;r<nums.length;r++){
            if(nums[r]==0){
                curr++;
            }
            while(curr>k){
                if(nums[left]==0){
                    curr--;
                }
                left++;
            }

            max = Math.max(max,r-left+1);
        }
        return max;
    }
}