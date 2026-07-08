class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        ans[0] = findFirst(nums,target);
        ans[1] = findLast(nums,target);
        return ans ;
    }
    private int findFirst(int [] nums, int target){
        int first = -1;
        int l = 0;
        int r = nums.length -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>target){
                r =  mid-1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                first = mid;
                r = mid-1;
            }
        }
        return first;
    }

    private int findLast(int [] nums, int target){
        int last = -1;
        int l = 0;
        int r = nums.length -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>target){
                r =  mid-1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                last = mid;
                l =mid+1;
            }
        }
        return last;
    }
}