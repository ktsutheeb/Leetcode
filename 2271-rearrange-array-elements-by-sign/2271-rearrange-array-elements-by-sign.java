class Solution {
    public int[] rearrangeArray(int[] nums){
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int k=0;
        int l=0;
        for(int i:nums){
            if(i>0) pos[k++]=i;
            else neg[l++]=i;
        }
        k=0;
        l=0;
        for(int j=0;j<nums.length;j++){
            if(j%2==0) nums[j]=pos[k++];
            else nums[j]=neg[l++];
        }
        return nums;
    }
}