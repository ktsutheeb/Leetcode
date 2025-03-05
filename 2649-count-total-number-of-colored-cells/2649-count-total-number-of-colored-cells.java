class Solution {
    public long coloredCells(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        else{
            long a = (long) Math.pow(n,2);
            long b = (long) Math.pow(n-1,2);
            long c = a+b;
            return c;
        }
    }
}