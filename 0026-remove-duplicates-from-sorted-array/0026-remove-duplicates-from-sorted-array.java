class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for (int num : nums) a.add(num);
        int[] arr = new int[a.size()];
        int i=0;
        for(int nu : a) arr[i++]=nu;
        Arrays.sort(arr);
        for(i=0;i<a.size();i++) nums[i]=arr[i];
        return  a.size();
    }
    
}