class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        helper(candidates, target, 0, curr, res);
        return res;
        
    }

    public void helper(int[] candidates, int remain, int start, List<Integer> curr, List<List<Integer>> res){
        
        // overshoot
        if(remain < 0){
            return;
        }
        
        if(remain == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            curr.add(candidates[i]);
            helper(candidates, remain - candidates[i], i, curr, res);

            curr.remove(curr.size() -1);
        }
    }
}