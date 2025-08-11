class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#' && (i+2)<s.length() && s.charAt(i+2)=='#'){
                int n=Integer.parseInt(s.substring(i,i+2))+96;
                sb.append((char)n);
                i+=2;
            }
            else{
                int n=s.charAt(i) - '0';
                n+=96;
                sb.append((char)n);
            }
        
        }
        return sb.toString();
    }
}