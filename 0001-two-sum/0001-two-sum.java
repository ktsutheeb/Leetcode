// class Solution {
//     public int[] twoSum(int[] nums, int target) {  
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
        
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rememing = target-nums[i];
            if(hm.containsKey(rememing)){
                return new int[]{hm.get(rememing),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}