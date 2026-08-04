class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
            set.add(nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i =min+1;i<max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;

    }
}