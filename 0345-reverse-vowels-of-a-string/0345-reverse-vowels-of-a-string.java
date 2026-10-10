class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l =0;
        int r = ch.length-1;
        while(l<r){
            while(l<r && (!isVowel(ch[l]))){
                l++;
            }
            while(l<r && (!isVowel(ch[r]))){
                r--;
            }
            char temp = ch[r];
            ch[r]=ch[l];
            ch[l] = temp;
            l++;
            r--;
        }
        return new String(ch);
    }
    public boolean isVowel(char c){
        char ch = Character.toLowerCase(c);
        if(ch =='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
            return true;
        }
        return false;
    }
}