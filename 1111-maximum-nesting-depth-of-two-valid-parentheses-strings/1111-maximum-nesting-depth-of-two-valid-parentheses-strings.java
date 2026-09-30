class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int [] arr = new int[n];
        int i =0;
        int dept = 0;
        for(char ch:seq.toCharArray()){
            if(ch=='('){
                dept++;
                arr[i++] = dept%2;
            }
            else{
                arr[i++] = dept%2;
                dept--;
            }
        }
        return arr;
    }
}