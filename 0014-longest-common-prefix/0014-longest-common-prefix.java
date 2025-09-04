class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        int i=0;
        for(String s1:strs)
        {
            if(s.length()>s1.length())
                s=s1;
        }
        for(int j=0;j<s.length();j++){
            boolean flag=true;
            for(String s1:strs)
            {
                if(s1.charAt(j)!=s.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            i++;
        }
        return s.substring(0,i);
    }
}