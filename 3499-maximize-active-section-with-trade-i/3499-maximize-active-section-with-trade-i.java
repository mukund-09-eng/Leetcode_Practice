class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        int totalOnes = 0;
        int previousZeroBlock = Integer.MIN_VALUE;
        int maxGain = 0;

        int i = 0;
        int n = s.length();

        while (i < n) {

            int j = i;

            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int length = j - i;

            if (s.charAt(i) == '1') {

                totalOnes += length;

            } else {

                maxGain = Math.max(maxGain, previousZeroBlock + length);
                previousZeroBlock = length;
            }

            i = j;
        }

        return totalOnes + maxGain;
    }
}