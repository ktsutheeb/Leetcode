class Solution {
    public int firstUniqChar(String s) {
        int[] u=new int[26];
        for(char c:s.toCharArray()){
            int n=c - 'a';
            u[n]++;
        }
        for(int i=0;i<s.length();i++){
            int n=u[s.charAt(i) - 'a'];
            if(n==1) return i;
        }
        return -1;
    }
}