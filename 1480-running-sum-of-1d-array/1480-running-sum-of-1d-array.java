class Solution {
    public int[] runningSum(int[] nums) {
        int[] rsum = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            rsum[i] = nums[i] + sum;
            sum = rsum[i];
        }
        return rsum;
    }
}