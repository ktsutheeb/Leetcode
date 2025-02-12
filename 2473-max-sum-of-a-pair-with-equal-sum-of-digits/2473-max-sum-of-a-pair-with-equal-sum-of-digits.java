// class Solution {
//     public int maximumSum(int[] nums) {
//         int[] sums = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int n=nums[i];
//             int s=0;
//             int l=0;
//             while(n>0){
//                 l=n%10;
//                 s+=l;
//                 n=n/10;
//             }
//             sums[i]=s;
//             s=0;
//         }
//         int max=-1;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 if(sums[i]==sums[j] && i!=j) max=Math.max(max,(nums[i]+nums[j]));
//             }
//         }
//         return max;
//     }
// }

class Solution{
    public int maximumSum(int[] nums){
        int[] newarr = new int[82];
        Arrays.fill(newarr,-1);
        int ans=-1;
        for(int num : nums){
            int sumOfDigits=0 , temp =num;
            while(temp>0) {
                sumOfDigits += temp%10;
                temp = temp/10;
            }
            if(newarr[sumOfDigits] != -1) ans=Math.max(ans,num+newarr[sumOfDigits]);
            newarr[sumOfDigits] = Math.max(num,newarr[sumOfDigits]);
        }
        return ans;
    }
}