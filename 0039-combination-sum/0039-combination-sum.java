class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        back(candidates, target, ans, new ArrayList<>(), 0,0);
        return ans;
    }

    public void back(int[] candidates,int target,List<List<Integer>> ans, List<Integer> temp,int sum,int j){
        if(target==sum){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<sum){
            return;
        }
        for(int i=j;i<candidates.length;i++){
            temp.add(candidates[i]);
            sum+=candidates[i];
            back(candidates, target,ans, temp, sum,i);
             temp.remove(temp.size()-1);
             sum-=candidates[i];
        }
    }
}