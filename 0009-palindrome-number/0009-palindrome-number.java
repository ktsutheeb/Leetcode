class Solution {
    public boolean isPalindrome(int x) {
        // String s = String.valueOf(x); // Convert to String
        // int n = s.length(); // Store the String length to int n

        // for (int i = 0; i < n / 2; i++) {
        //     // We check whether the elements at the same distance from
        //     // beginning and from ending are same, if not we return false
        //     if (s.charAt(i) != s.charAt(n - i - 1))
        //         return false;
        // }

        // // if no flaws are found we return true
        // return true;

        if(x<0) return false;
        String s=String.valueOf(x);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}