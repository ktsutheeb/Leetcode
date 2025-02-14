// class Solution {
//     public int minOperations(int[] nums, int k) {
//         if(nums.length>=2){
//             Arrays.sort(nums);
//             ArrayList<Integer> al = new ArrayList<>();
//             for(int i=0;i<nums.length;i++) al.add(nums[i]);
//             int nos=0;
//             int math=0;
//             while(al.get(0)<k && al.size() > 1){
//             math += al.get(0)*2;
//             al.remove(0);
//             math += al.get(0);
    
            
//             al.remove(0);
//             al.add(math);
//             Collections.sort(al);
//             for(int i: al) System.out.print(i+" ");
//             nos++;
//             math=0;}
            
//         return nos;
//         }
//         else{
//             return 1;
//         }
//     }
// }

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums) pq.add((long)num);
        int nos= 0;
        while(pq.size() > 1 && pq.peek()<k){
            long x= pq.poll();
            long y = pq.poll();
           
            pq.add(x*2+y);
            nos++;
        }
        return nos;
    }
}


