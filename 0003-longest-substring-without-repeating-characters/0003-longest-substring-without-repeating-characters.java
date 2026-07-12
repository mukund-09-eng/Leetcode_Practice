class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
     int l =0;
     int maxlen =0;
     for(int i =0;i<s.length();i++){
        char c = s.charAt(i);
        if(map.containsKey(c)){
            l = Math.max(l , map.get(c)+1);
        }
        map.put(c,i);
        maxlen = Math.max(maxlen , i-l+1);
     }   
     return maxlen; 
    }
}