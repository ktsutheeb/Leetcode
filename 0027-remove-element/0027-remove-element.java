// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int count=0;
//         for(int num:nums) if(num!=val) count++;
//         int []ans= new int[count];
//         int i=0;
//         Arrays.sort(nums);
//         for(int nu:nums) if(nu!=val) ans[i++]=nu;
//         int j=0;
//         for(int n:ans) nums[j++]=n;
//         return count; 
//     }
// }
 class Solution {
     public int removeElement(int[] nums, int val) {
        int k=0;
        int i=0;
        for(int num:nums) if(num!=val) nums[k++]=num;
        return k;
     }}