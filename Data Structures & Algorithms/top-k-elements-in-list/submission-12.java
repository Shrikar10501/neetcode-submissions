class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //I will create int to count map then i will take values/counts sort it desc get back the keys of them and then set it to array and return
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] counts = new int[nums.length];
        int p=0;
        for (Map.Entry<Integer,Integer> e : map.entrySet()) { 
            counts[p]= e.getValue();
            p++; 
        }
        Arrays.sort(counts);
        for(int i=counts.length-1; i>=0;i--){
        System.out.print(counts[i]);}

        //need to counvert counts to a set before doing next part

        int[] ans = new int[k];
        int t=0,currentcount=0;
        for(int i=counts.length-1; i>=counts.length-k;i--){
            if(currentcount==counts[i]){
                continue;
            }
            else{
                currentcount=counts[i];
            }
            
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                if(e.getValue().equals(counts[i])){
                    ans[t] = e.getKey();
                    t++;
                    if(t==k){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
