class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm = new HashMap<>();
        HashMap<String,Integer> h = new HashMap<>();

        
        for(int i=0;i<words1.length;i++){
            String s = words1[i];
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int ans =0;
        for(int i=0;i<words2.length;i++){
            String d = words2[i];
            h.put(d,h.getOrDefault(d,0)+1);
        }
        for(int i=0;i<words1.length;i++){
            String c= words1[i];
            if(h.getOrDefault(c,0)==1){
                if(hm.getOrDefault(c,0)==1){
                    ans++;
                }
            }
        }
        return ans;

       
    }
}