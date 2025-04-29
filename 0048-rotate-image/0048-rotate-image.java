class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix[0].length;
        int[][] ans=new int[len][len];
        int postion=len-1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                ans[j][postion]=matrix[i][j];
            }
            postion--;
        }
        for(int k=0;k<len;k++){
            matrix[k]=ans[k].clone();
        }
    }
}