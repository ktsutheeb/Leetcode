class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int s = grid[0].length;
        int[] arr = new int[s*s];
        int index=0;
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++) arr[index++] = grid[i][j];
        }
        Arrays.sort(arr);
        int count=0;
        int[] ans = new int[2];
        for(int i=0;i<s*s-1;i++){
            if(arr[i]==arr[i+1]) ans[0]=arr[i];
            if(arr[i+1]!=arr[i]+1 && arr[i]!=arr[i+1]){
                    ans[1]=arr[i]+1;
                    count++;
            }
        }
        if(count==0){
            if(arr[0]!=1) ans[1]=1;
            else ans[1]=arr[s*s-1]+1;
        }
        return ans;
    }
}