/******************************************************************************************************
* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).   *
* Return the running sum of nums.                                                                     *
*******************************************************************************************************

class Solution {
    public int[] runningSum(int[] nums) {
        int[] total = new int[nums.length];
        
        //First item in array will always be the first item in nums.
        total[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            total[i] = nums[i] + total[i-1];
        }
        return total;
    }
}
