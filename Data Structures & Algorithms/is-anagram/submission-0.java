class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch1 : s.toCharArray()) {
            if (map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1) + 1);
            } else {
                map1.put(ch1, 1);
            }
        }

        for (char ch2 : t.toCharArray()) {
            if (map2.containsKey(ch2)) {
                map2.put(ch2, map2.get(ch2) + 1);
            } else {
                map2.put(ch2, 1);
            }
        }

        return map1.equals(map2);
    }
}