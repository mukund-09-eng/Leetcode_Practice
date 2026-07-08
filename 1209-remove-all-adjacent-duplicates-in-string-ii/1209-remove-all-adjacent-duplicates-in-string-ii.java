class Solution {
    public String removeDuplicates(String s, int k) {
       StringBuilder sb = new StringBuilder();
       int [] count = new int[s.length()];  
    for(char ch :s.toCharArray()){
        sb.append(ch);
        int last = sb.length() -1;
        if(last>0 && sb.charAt(last)==sb.charAt(last-1)){
            count[last] =count[last-1] + 1;
        }
        else{
            count[last] = 1;
        }
        if(count[last]==k){
            sb.delete(sb.length()-k,sb.length());
        }
    }
    return sb.toString();
    }

}