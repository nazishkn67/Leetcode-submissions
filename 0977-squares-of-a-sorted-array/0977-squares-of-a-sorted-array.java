class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int start = 0, end = n-1;
        for(int i=n-1; i>=0; i--) {
            if(Math.abs(nums[end]) > Math.abs(nums[start])) {
                ans[i] = nums[end] * nums[end];
                end--;
            } else {
                ans[i] = nums[start] * nums[start];
                start++;
            }
        }
        return ans;
    }
}