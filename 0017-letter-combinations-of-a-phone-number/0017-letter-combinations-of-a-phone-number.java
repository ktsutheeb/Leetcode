class Solution {
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.isEmpty()) return result;
        b(digits,result,"",0);
        return result;
    }
    public void b(String digits,List<String> result,String cur,int index){
        if(cur.length()==digits.length()){
            result.add(cur);
            return;
        }
        String s=map[digits.charAt(index)-'0'];
        for(char c:s.toCharArray()) b(digits,result,cur+c,index+1);
    }
}