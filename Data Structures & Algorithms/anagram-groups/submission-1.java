class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>, List<String>> gigamap = new HashMap<>();
        for(int i=0;i< strs.length;i++){
            Map<Character,Integer> j = createMap(strs[i]);
            if(gigamap.get(j)!=null){
                List<String> temp = gigamap.get(j);
                temp.add(strs[i]);
                gigamap.put(j,temp);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                gigamap.put(j,temp);
            }
        }
        List<List<String>> ans= new ArrayList<>();
        for (Map.Entry<Map<Character,Integer>, List<String>> e : gigamap.entrySet()) {
            ans.add(e.getValue());
        }
       return ans;
    }

    public Map<Character,Integer> createMap(String s){
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        return m;
    }
}