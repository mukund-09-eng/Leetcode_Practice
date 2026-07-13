class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < fruits.length; r++) {

            // Current fruit add karo
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            // Jab 2 se zyada distinct fruits ho jaye
            while (map.size() > 2) {

                // Left fruit ki frequency kam karo
                map.put(fruits[l], map.get(fruits[l]) - 1);

                // Agar frequency 0 ho gayi to map se hata do
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }

                l++;
            }

            // Valid window ki maximum length
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}