class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
       HashMap<String,String> list = new HashMap<>();
       for(List<String> pair : knowledge){
        list.put(pair.get(0),pair.get(1));
       }
       
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int j =i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }

                String key = s.substring(i+1,j);
                String value = list.getOrDefault(key,"?");
               
                
                sb.append(value);
                i = j;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}