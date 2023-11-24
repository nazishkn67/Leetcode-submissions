class Solution {
    public int findNumbers(int[] nums) {
        int temp, noOfDigits=0, count=0;
        for(int i=0; i<nums.length; i++) {
            temp=nums[i];
            while(temp!=0) {
                temp = temp/10;
                noOfDigits++;
            }
            
            if(noOfDigits%2 == 0)
                count++;
            noOfDigits=0;
        }
        return count;
    }
}