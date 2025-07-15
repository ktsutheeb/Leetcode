class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean d=false;
        boolean u=false;
        boolean l=false;
        boolean v=false;
        boolean co=false;
        String s="aeuioAEUIO";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isDigit(c)) d=true;
            else if(Character.isAlphabetic(c)){
                    if(s.contains(Character.toString(c))) v=true;
                    else co=true;
            }
            else return false;
        }
        if(v && co) return true;
        else return false;
    }
}