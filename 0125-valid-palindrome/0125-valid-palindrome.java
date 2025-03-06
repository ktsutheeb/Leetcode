class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.print(s);
        int p1=0;
        int p2=s.length()-1;
        if(p1==p2) return true;
        while(p1<p2){
            if(s.charAt(p1)!=s.charAt(p2)) return false;
            p1++;
            p2--; 
        }
        return true;
    }
}