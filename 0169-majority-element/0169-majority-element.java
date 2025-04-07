class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int num:nums) hm.put(num,hm.getOrDefault(num,0)+1);
        
        int ans;
        ArrayList<Integer> al=new ArrayList<>(hm.values());
        // int max=Collections.max(al);
        // for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        //     if(max==entry.getValue()) return entry.getKey();

        for(int i:hm.keySet()) {
        if(hm.get(i)>(nums.length-1)/2)
        return i;
        }
        return 0;
    }
}