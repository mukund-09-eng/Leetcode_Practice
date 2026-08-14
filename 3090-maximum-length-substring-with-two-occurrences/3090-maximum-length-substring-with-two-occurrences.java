class Solution {
    public int maximumLengthSubstring(String s) {
        int [] freq = new int[26];
        int l = 0;
        int max =0;
        for(int i =0;i<s.length();i++){
           freq[s.charAt(i)-'a']++;
            while(freq[s.charAt(i)-'a']>2){
               freq[s.charAt(l)-'a']--;
                l++;
            }
            max = Math.max(max,i-l+1);
        }
        return max;       
    }
}