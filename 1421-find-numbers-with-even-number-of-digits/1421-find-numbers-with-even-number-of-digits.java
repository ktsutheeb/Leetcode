class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i:nums){
            // int x=String.valueOf(i).length();
            // if(x%2==0) res++;
            int x=0;
            while(i>0){
                i=i/10;
                x++;
            }
            if(x%2==0) res++;
        }
        return res;
    }
}