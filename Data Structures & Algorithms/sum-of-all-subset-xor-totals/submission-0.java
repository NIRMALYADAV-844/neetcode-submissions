class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, 0);
        return sum;
    }

    public void backtrack(int[] nums, int i, int xor){
        if(i == nums.length){
            sum += xor;
            return;
        }

        backtrack(nums, i+1, xor^nums[i]);
        backtrack(nums, i+1, xor);
    }
}