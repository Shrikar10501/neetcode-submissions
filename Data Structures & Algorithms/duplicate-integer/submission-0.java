class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                return true;
            }
            a.add(nums[i]);
        }
        return false;
    }
}