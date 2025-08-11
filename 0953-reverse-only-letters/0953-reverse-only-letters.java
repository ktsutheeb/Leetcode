class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        if(Character.isAlphabetic(s.charAt(i)))
        s1.append(s.charAt(i));
        s1=s1.reverse();
        String s2="";
        int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isAlphabetic(c))
            s2+=s1.charAt(j++);
            else
            s2+=c;
        }
        return s2;
    }
}