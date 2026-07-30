class Solution {
    public int minimumPushes(String word) {
        int l = word.length();
        if(l<=8){
            return l;
        }
        else if(l<=16){
      int two =2*(l-8);
      return 8+two;
        }
        else if(l<=24){
            int triple = 3*(l-8);
            return triple;
        }
        
            return 48+(4*(l-24));
        
    }
}