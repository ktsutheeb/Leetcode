class Solution {
    public int f(int [] ar,int i,int []dp){
        if(i>=ar.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int s=ar[i]+f(ar,i+2,dp);
        int sk=f(ar,i+1,dp);
        dp[i]=Math.max(s,sk);
        return dp[i];

    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return f(nums,0,dp);
    }
}