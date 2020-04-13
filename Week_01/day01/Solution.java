class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int zeroIndex = 0;
        for (int i = 0; i < size; i++) {
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                zeroIndex++;
            }
        }
    }
}