
// class Solution {
//     public int possibleStringCount(String word) {
//         HashMap<Character,Integer> hm=new HashMap<>();
//         int res=1;
//         for(int i=0;i<word.length();i++){
//             char c=word.charAt(i);
//             boolean entry=false;
//             while((i!=0 && word.charAt(i-1)==c) || (i!=word.length()-1 && word.charAt(i+1)==c)){
//                 res++;
//                 i++;
//                 entry=true;
//             }
//             if(entry) res--;
//         }
//         return res;
//     }
// }
class Solution {
    public int possibleStringCount(String word) {
        if (word == null || word.isEmpty()) return 0;

        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
