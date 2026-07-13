class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> list = new ArrayList<>();
        int minlen = String.valueOf(low).length();
        int maxlen = String.valueOf(high).length();

        for(int len = minlen;len<=maxlen;len++){
            for(int i =0;i+len<=9;i++){
                int num = Integer.parseInt(s.substring(i,i+len));

                if(num>= low && num <= high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}