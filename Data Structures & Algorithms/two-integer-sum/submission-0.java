class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int a = nums[i]+nums[j];
                if(a==target){
                    int[] ans = new int[2];
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return null;
    }
}
