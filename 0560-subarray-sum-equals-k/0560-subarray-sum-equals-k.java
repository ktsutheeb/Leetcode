class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int result=0;
        int prefixSum=0;
        for(int num:nums){
            prefixSum+=num;
            if(hm.containsKey(prefixSum-k)){
                result += hm.get(prefixSum-k);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return result;
    }
}