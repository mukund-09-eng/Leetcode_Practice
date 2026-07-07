class Solution {
    public String sortSentence(String s) {
        String []arr = s.split(" ");
        String [] ans = new String[arr.length];

        for(String word : arr){
            int index = word.charAt(word.length()-1) - '0';
            ans[index-1] = word.substring(0,word.length()-1);
        }
        StringBuilder sb = new StringBuilder();

        for(String word : ans){
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}