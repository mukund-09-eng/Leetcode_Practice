class Solution {
    public int[] searchRange(int[] nums, int target) {
       int [] ans = {-1,-1};
       ans[0] = findfirst(nums,target);
       ans[1] = findlast(nums,target);

       return ans;
    }

       private int findfirst(int[] nums, int target){
        int l =0;
        int r = nums.length-1;
        int first = -1;
        while(l<=r){
            int mid = (l + r)/2;
            if(nums[mid]== target){
                first = mid ;
                r = mid -1;
            }
            else if(nums[mid]>target){
                r = mid-1;

            }
            else l = mid+1;
        }
        return first;
       }

       private int findlast(int[] nums, int target){
        int l =0;
        int r = nums.length-1;
        int last = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                last = mid;
                l=  mid+1;
            }
            else if(nums[mid]>target) r = mid-1;
            else l = mid+1;
        }
        return last;
       }

        
    }