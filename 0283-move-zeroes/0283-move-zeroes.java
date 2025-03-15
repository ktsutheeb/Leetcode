class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr2 = new int[n];
        int countZero = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                arr2[j++] = nums[i];
            } else {
                countZero++; 
            }
        }

        while (countZero > 0) {
            arr2[j++] = 0;
            countZero--;
        }
        for (int k = 0; k < n; k++)
            nums[k] = arr2[k];
    }
}