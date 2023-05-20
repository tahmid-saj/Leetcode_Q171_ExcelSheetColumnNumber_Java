class Solution {
    public int titleToNumber(String columnTitle) {
        // Declare a hash map of the alphabet
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('A', 1);
        hashMap.put('B', 2);
        hashMap.put('C', 3);
        hashMap.put('D', 4);
        hashMap.put('E', 5);
        hashMap.put('F', 6);
        hashMap.put('G', 7);
        hashMap.put('H', 8);
        hashMap.put('I', 9);
        hashMap.put('J', 10);
        hashMap.put('K', 11);
        hashMap.put('L', 12);
        hashMap.put('M', 13);
        hashMap.put('N', 14);
        hashMap.put('O', 15);
        hashMap.put('P', 16);
        hashMap.put('Q', 17);
        hashMap.put('R', 18);
        hashMap.put('S', 19);
        hashMap.put('T', 20);
        hashMap.put('U', 21);
        hashMap.put('V', 22);
        hashMap.put('W', 23);
        hashMap.put('X', 24);
        hashMap.put('Y', 25);
        hashMap.put('Z', 26);

        int ret = 0;

        // Loop through columnTitle using i, at the same time use j starting from columnTitle.length() - 1 to 0
        // ret += hashMap.get(columnTitle.charAt(i)) * j
        // return ret after the loop

        for (int i = 0, j = columnTitle.length() - 1; i < columnTitle.length(); i++, j--) {
            ret += hashMap.get(columnTitle.charAt(i)) * Math.pow(26, j);
        }

        return ret;
    }
}
