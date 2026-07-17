class Solution {
    public String minWindow(String s, String t) {
   
        if(s.length()<t.length()){
            return "";
        }

        int [] freq = new int[128];
        for(char c :t.toCharArray()){
            freq[c]++;
        } 
        int l =0;
        int st =0;
        int min = Integer.MAX_VALUE;
        int req = t.length();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch]>0){
                req--;
            }
            freq[ch]--;
            while(req==0){
                if((i-l+1)<min){
                    min = i-l+1;
                    st = l;
                }
                char leftch = s.charAt(l);
                freq[leftch]++;
                if(freq[leftch]>0){
                    req++;
                }
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(st,st+min);
    }
}