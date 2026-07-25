class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int pr =1;
        while(n!=0){
            int rem = n%10;
            int temp = n/10;
            n/=10;
            while(temp!=0){
                int rem1 = temp%10;
                pr = rem1 * rem;
                max = Math.max(max , pr);
                temp/=10;
            }
        }
        return max;
    }
}