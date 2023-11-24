class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0, max = 0; 
        
        for(int i=0; i<n ; i++) {
            if(nums[i] == 1) {
                count += 1;
                max = Math.max(count, max);
            }
            else
                count = 0;
        }
        return max;
    }
}