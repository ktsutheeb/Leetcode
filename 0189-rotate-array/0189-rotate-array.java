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
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n=nums.length;
//         k=k%n;
//         int newarr[] = new int[n];
//         for(int i=0;i<n;i++) newarr[(k+i)%n] = nums[i];
//         for(int i=0;i<n;i++) nums[i] = newarr[i];
//     }
// }
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int nums[],int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    }