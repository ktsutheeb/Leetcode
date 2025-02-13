// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n =nums.length;
//         int newarr[] = new int[n];
//         while(k>0){
//             int last = nums[n-1];
//             newarr[0]=last;
//             for(int i=0;i<n-1;i++){
//                 newarr[i+1]=nums[i];
//             }
//             for(int i=0;i<n;i++){
//                 nums[i]=newarr[i];
//             }
//             k--;
//         }
//     }
// }
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int newarr[] = new int[n];
        for(int i=0;i<n;i++) newarr[(k+i)%n] = nums[i];
        for(int i=0;i<n;i++) nums[i] = newarr[i];
    }
}