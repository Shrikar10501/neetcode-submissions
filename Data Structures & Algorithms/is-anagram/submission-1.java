class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> a= new HashMap<>();
        Map<Character,Integer> b= new HashMap<>();
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i), a.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            b.put(t.charAt(i), b.getOrDefault(t.charAt(i), 0) + 1);
        }
        return a.equals(b);
    }
}
