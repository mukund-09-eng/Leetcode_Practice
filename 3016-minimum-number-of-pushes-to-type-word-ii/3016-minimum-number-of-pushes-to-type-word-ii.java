class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int [26];
        for(char c : word.toCharArray()){
            freq[c-'a']++;
        }
       Arrays.sort(freq);
       int l =0;
       int r = freq.length -1;
       while(l<r){
        int temp=freq[l];
        freq[l]=freq[r];
        freq[r]=temp;
        l++;
        r--;
       }
        int press =0;
        for(int i =0;i<26;i++){
            press+=(i/8 + 1)*freq[i];
        }
        return press;
    }
}